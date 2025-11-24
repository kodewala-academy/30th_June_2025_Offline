package com.kodewala.mmt.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kodewala.mmt.profile.bean.UserProfile;

@Controller
public class ProfileController {

	@RequestMapping("showProfilePage")
	public String showProfilePage() {
		System.out.println(" Displaying profile page to client/user");
		return "profile";
	}

	@PostMapping("createProfile") // requestmapping + method type = post
	public String createUserProfile(@ModelAttribute UserProfile userProfile, Model model) {

		System.out.println(" First Name : " + userProfile.getFirstName());
		System.out.println(" Last Name : " + userProfile.getLastName());
		System.out.println(" Email Name : " + userProfile.getEmail());
		System.out.println(" mobile : " + userProfile.getMobile());

		String email = userProfile.getEmail();
		String mobile = userProfile.getMobile();
		
		String userId = generateUserId(email, mobile);

		model.addAttribute("userID", userId);
		
		System.out.println(" Generated user id is :::::::::::: " + userId);
		return "profile-success";
	}

	public static String generateUserId(String email, String mobile) {
		String username = email.split("@")[0];
		String first4 = username.length() >= 4 ? username.substring(0, 4) : username;
		String last4 = mobile.substring(mobile.length() - 4);
		return first4 + last4;
	}

}

package com.kodewala.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public class App {
	public static void main(String[] args) {// 1. Set Kafka Configuration (Bootstrap server, Key & Value serializers)
		Properties props = new Properties();
		props.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
		props.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

		// 2. Create Kafka Producer
		KafkaProducer<String, String> producer = new KafkaProducer<>(props);

		// 3. Create & Send Messages
		for (int i = 0; i < 20; i++) {

			ProducerRecord<String, String> record = new ProducerRecord<>("payment", "pay" + i,
					"Test Payment " + i);

			producer.send(record);
		}

		// 4. Close Producer
		producer.close();

		System.out.println("Messages have been sent to Kafka successfully!");
	}
}

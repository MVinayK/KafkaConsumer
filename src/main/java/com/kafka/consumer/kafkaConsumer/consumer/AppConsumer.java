package com.kafka.consumer.kafkaConsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.consumer.kafkaConsumer.model.User;

@Service
public class AppConsumer {

	@KafkaListener(topics = "TOPIC_1", groupId = "consumer_group_id", containerFactory = "kafkaListenerContainerFactory")
	public void consumeUser(User user) {
		System.out.println(user.toString());
	}
}

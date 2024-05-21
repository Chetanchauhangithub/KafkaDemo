package com.kafkademo.KafkaDemo.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @KafkaListener(topics = "kafka_topic",groupId = "kafka_group")
    public void listenToTopic(String message){
            System.out.println("The message is recieved: "+ message);
    }
}

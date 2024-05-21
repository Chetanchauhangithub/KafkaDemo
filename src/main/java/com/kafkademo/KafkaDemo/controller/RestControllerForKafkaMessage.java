package com.kafkademo.KafkaDemo.controller;


import com.kafkademo.KafkaDemo.services.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api")
public class RestControllerForKafkaMessage {

    @Autowired
    Producer producer;
    @GetMapping("producerMsg")
    public void sendMessage(@RequestParam("message") String message){

            producer.sendMsgToTopic(message);
    }
}

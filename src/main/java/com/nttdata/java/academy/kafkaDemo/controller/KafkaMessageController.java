package com.nttdata.java.academy.kafkaDemo.controller;

import com.nttdata.java.academy.kafkaDemo.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaMessageController {

    @Autowired
    private KafkaProducerService producerService;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        producerService.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka topic");
    }
}


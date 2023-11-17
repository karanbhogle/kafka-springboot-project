package net.karanbhogle.kafkaspringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.karanbhogle.kafkaspringbootproject.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
	
	@Autowired
	public KafkaProducer kafkaProducer;
	
	/***
	 * This method takes "message" Query Parameter passed in the GET URL.
	 * The URL when tested in localhost will be something like below:
	 * 		http://localhost:8080/api/v1/kafka/publish?message=Hello World. It's Kafka Message.
	 * @param message String
	 * @return ResponseEntity.ok
	 */
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message) {
		kafkaProducer.sendMessage(message);
		return ResponseEntity.ok("Message sent successfully");
	}
}

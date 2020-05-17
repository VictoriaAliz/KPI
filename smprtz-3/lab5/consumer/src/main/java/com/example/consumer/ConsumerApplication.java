package com.example.consumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		try {
			KafkaConsumerDemo.runConsumer();
		} catch(Exception e) {
			System.out.println(e);
		}
	}

}

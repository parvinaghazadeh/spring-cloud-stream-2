package com.parvin.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
public class CustomerConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerConsumerApplication.class, args);
    }

    @StreamListener(target = Sink.INPUT)
    public void processRegisterCustomers(String customer) {
        System.out.println("Customer registered by client: " + customer);
    }
}

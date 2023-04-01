package com.parvin.producer.controller;

import com.parvin.producer.model.Customer;
import com.parvin.producer.source.CustomerProducerSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "customer")
@EnableBinding(CustomerProducerSource.class)
public class CustomerProducerController {

    @Autowired
    CustomerProducerSource customerProducerSource;

    @PostMapping("/")
    public String registerCustomer(@RequestBody Customer customer){
        customerProducerSource.customerRegistrations().send(MessageBuilder.withPayload(customer).build());
        return "well, your customer registered!";
    }

}

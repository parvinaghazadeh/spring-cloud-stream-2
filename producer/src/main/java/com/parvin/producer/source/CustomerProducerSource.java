package com.parvin.producer.source;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface CustomerProducerSource {

    @Output("customerRegistrationChannel")
    MessageChannel customerRegistrations();
}

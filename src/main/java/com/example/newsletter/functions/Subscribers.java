package com.example.newsletter.functions;

import com.example.newsletter.model.Subscriber;
import com.example.newsletter.service.SubscriberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class Subscribers {
    private final SubscriberService subscriberService;

    public Subscribers(SubscriberService subscriberService) {
        this.subscriberService = subscriberService;
    }

    @Bean
    public Consumer<String> create() {
        return subscriberService::create;
    }

    @Bean
    public Supplier<List<Subscriber>> findAll() {
        return subscriberService::findAll;
    }

}

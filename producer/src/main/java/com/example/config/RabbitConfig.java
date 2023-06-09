package com.example.config;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

  @Bean
  public Queue testQueue(@Value("${producer.queue-names.test-queue}") String queueName) {
    return new Queue(queueName, false);
  }
}

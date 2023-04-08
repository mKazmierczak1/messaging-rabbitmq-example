package com.example.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MessageProducer implements ApplicationRunner {

  private final RabbitTemplate template;
  private final Queue queue;

  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("Sending message...");
    sendMessage("Hello world!");
    System.out.println("Message sent!");
  }

  private void sendMessage(Object message) {
    template.convertAndSend(queue.getName(), message);
  }
}

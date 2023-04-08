package com.example.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

  @RabbitListener(queues = "${consumer.queue-name}")
  public void listen(String in) {
    System.out.println("Message read from myQueue : " + in);
  }
}

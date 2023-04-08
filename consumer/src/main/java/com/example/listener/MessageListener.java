package com.example.listener;

import com.example.Person;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

  @RabbitListener(queues = "${consumer.queue-names.test-queue}")
  public void listen(Person in) {
    System.out.println("Message read from myQueue : " + in);
  }
}

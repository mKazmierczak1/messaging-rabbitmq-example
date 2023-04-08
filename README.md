# RabbitMQ example with Spring Boot

### Description
A simple application with examples for RabbitMQ producer and consumer written using Spring Boot.

### RabitMQ setup
- Docker - https://registry.hub.docker.com/_/rabbitmq/ <br>
- RabbitMQ downlad page - https://www.rabbitmq.com/download.html <br>

There is also a prepared docker-compose file with RabbitMQ server and management plugin.

### Action steps
1) Start a RabbitMQ server.
2) Run the producer application to create a new queue.
3) Start the consumer application to start listening to the queue and consuming messages.
4) Run again producer application to send new message

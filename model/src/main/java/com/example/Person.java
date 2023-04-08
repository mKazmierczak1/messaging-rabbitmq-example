package com.example;

import java.io.Serializable;

// The class must implement Serializable interface to be used in RabbitMQ communications
public record Person(int id, String firstName, String lastName, double height)
    implements Serializable {}

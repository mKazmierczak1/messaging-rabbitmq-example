package com.example;

import java.io.Serializable;

public record Person(int id, String firstName, String lastName, double height)
    implements Serializable {}

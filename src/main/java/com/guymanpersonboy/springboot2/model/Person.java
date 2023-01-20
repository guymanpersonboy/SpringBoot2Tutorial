package com.guymanpersonboy.springboot2.model;

import java.util.UUID;

public class Person {
    private UUID id;
    private String name;

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
}

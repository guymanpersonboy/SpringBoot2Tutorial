package com.guymanpersonboy.springboot2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {
    private UUID id;
    @NotBlank
    private String name;

    public Person(@JsonProperty UUID id,
                  @JsonProperty String name) {
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

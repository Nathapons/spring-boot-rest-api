package com.ltp.contacts.model;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class Contact {
    private String id;
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Number cannot be blank")
    private String phoneNumber;

    public Contact() {
        this.id = UUID.randomUUID().toString();
    }
}

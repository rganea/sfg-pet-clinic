package com.example.sfgpetclinic.model;

import com.fasterxml.jackson.databind.ser.Serializers;

public class PetType extends Serializers.Base {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

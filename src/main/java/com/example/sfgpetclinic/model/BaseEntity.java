package com.example.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id; //recommendation of Hibernate

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

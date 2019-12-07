package com.anujaneja.rest.webservices.restfulwebservices.model.versioning;

public class PersonV1 {
    String name;

    public PersonV1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

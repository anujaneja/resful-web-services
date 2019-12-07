package com.anujaneja.rest.webservices.restfulwebservices.controller.versioning;

import com.anujaneja.rest.webservices.restfulwebservices.model.versioning.Name;
import com.anujaneja.rest.webservices.restfulwebservices.model.versioning.PersonV1;
import com.anujaneja.rest.webservices.restfulwebservices.model.versioning.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    //URI based versioning
    @GetMapping("v1/person")
    public PersonV1 personV1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping("v2/person")
    public PersonV2 personV2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //parameter based versioning
    @GetMapping(path = "person/param",params = "version=1")
    public PersonV1 personParamV1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "person/param",params = "version=2")
    public PersonV2 personParamV2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }

    //header based versioning
    @GetMapping(path = "person/header",headers = "X-API-VERSION=v1")
    public PersonV1 personHeaderV1() {
        return new PersonV1("Bob Charlie");
    }

    @GetMapping(path = "person/header",headers = "X-API-VERSION=v2")
    public PersonV2 personHeaderV2() {
        return new PersonV2(new Name("Bob", "Charlie"));
    }




}

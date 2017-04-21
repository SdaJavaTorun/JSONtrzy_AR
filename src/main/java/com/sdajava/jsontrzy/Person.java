package com.sdajava.jsontrzy;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private Object id;
    private Object name;
    private Object username;
    private Object email;
    private List<Address> addressList = new ArrayList<>();
    private Object phone;
    private Object website;

    public Person(Object id, Object name,
                  Object username, Object email, List<Address> addressList, Object phone, Object website) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.addressList = addressList;
        this.phone = phone;
        this.website = website;
    }
}
package com.geekshubsacademy.demomvcthymeleaf.services;

import com.geekshubsacademy.demomvcthymeleaf.models.User;

import java.util.ArrayList;
import java.util.List;

public interface EjemploService {

    public default  List<User> getListUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Xavi","pass"));
        users.add(new User("Alice","pass"));
        users.add(new User("Leon","pass"));
        users.add(new User("Nemesis","pass"));
        return  users;
    }
}

package com.geekshubsacademy.demomvcthymeleaf.services.impl;

import com.geekshubsacademy.demomvcthymeleaf.models.User;
import com.geekshubsacademy.demomvcthymeleaf.services.EjemploService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("EjemploService")
public class EjemploServiceImpl implements EjemploService
{
    @Override
    public List<User> getListUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Xavi","pass"));
        users.add(new User("Alice","pass"));
        return  users;
    }

}

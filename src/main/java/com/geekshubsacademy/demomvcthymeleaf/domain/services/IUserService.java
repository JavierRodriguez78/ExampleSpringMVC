package com.geekshubsacademy.demomvcthymeleaf.domain.services;

import com.geekshubsacademy.demomvcthymeleaf.domain.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    public  List<User> findAll();
    public void save(User user);
    public   Optional<User> findOne(Long id);
    public  void delete(Long id);
}

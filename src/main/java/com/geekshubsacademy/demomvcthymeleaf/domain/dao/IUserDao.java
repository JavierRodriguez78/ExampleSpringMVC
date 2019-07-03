package com.geekshubsacademy.demomvcthymeleaf.domain.dao;



import com.geekshubsacademy.demomvcthymeleaf.domain.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IUserDao extends CrudRepository<User, Long> {
}

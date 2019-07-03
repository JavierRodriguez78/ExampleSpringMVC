package com.geekshubsacademy.demomvcthymeleaf.domain.services;

import com.geekshubsacademy.demomvcthymeleaf.domain.dao.IUserDao;
import com.geekshubsacademy.demomvcthymeleaf.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class IUserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) userDao.findAll();
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> findOne(Long id) {
        return userDao.findById(id);
    }

    @Override
    public void delete(Long id) {
        userDao.deleteById(id);
    }
}

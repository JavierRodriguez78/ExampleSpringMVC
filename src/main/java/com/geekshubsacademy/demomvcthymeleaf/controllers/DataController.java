package com.geekshubsacademy.demomvcthymeleaf.controllers;

import com.geekshubsacademy.demomvcthymeleaf.domain.entities.User;
import com.geekshubsacademy.demomvcthymeleaf.domain.services.IUserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DataController {

    private static final Log logger = LogFactory.getLog("DataController.class");

    @Autowired
    private IUserService userService;

    @GetMapping("/litardata")
    public ModelAndView listarData(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH");
        Date date = new Date();
        User user = new User("Xavi","pass",date);
        logger.info("Usuario añadido ->");
        userService.save(user);
        logger.info("Datos recibidos" + userService.findAll());
        logger.info("Usuario recibido ->" + userService.findOne((long)1).toString());
        logger.info("Eliminar el usuario");
        userService.delete((long)1);
        ModelAndView mv = new ModelAndView();

        return null;
    }
}

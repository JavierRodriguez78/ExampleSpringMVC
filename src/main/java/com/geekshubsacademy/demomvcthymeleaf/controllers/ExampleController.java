package com.geekshubsacademy.demomvcthymeleaf.controllers;

import com.geekshubsacademy.demomvcthymeleaf.models.User;
import com.geekshubsacademy.demomvcthymeleaf.services.EjemploService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController {

    @Autowired
    @Qualifier("EjemploService")
    private EjemploService ejemploService;


    @GetMapping("/")
    public String inicio(Model model)
    {
        model.addAttribute("name","Mike");
        return "index";
    }

    @GetMapping("/index")
    public ModelAndView inicio1()
    {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("name","Paul");
        return mav;
    }

    @GetMapping("/data")
    public ModelAndView inicioData()
    {
        ModelAndView mav = new ModelAndView("data");
        mav.addObject("User", new User("xavi","pass"));
        return mav;
    }

    @GetMapping("/dataList")
    public ModelAndView dataList()
    {
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("Users",ejemploService.getListUsers());
        //int result = 5/0;
        return mav;
    }

    @GetMapping("/layout")
    public String exampleLayout()
    {
        return "layoutExample";
    }

}

package com.geekshubsacademy.demomvcthymeleaf.controllers;

import com.geekshubsacademy.demomvcthymeleaf.components.ExampleComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComponentsController {

    @Autowired
    @Qualifier("ExampleComponent")
    private ExampleComponent exampleComponent;

    @GetMapping("/component")
    public ModelAndView ComponentExample()
    {
        exampleComponent.newComponent();
        return null;
    }

}

package com.geekshubsacademy.demomvcthymeleaf.controllers;

import com.geekshubsacademy.demomvcthymeleaf.models.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class PetitionsController {

    private static final Log logger = LogFactory.getLog("PetitionsController.class");

    @GetMapping("/request")
    public ModelAndView request(@RequestParam(name="name") String name, @RequestParam(name="edad") int edad)
    {
        ModelAndView mv = new ModelAndView("request");
        mv.addObject("user", name);
        return mv;
    }

    @GetMapping("/request2/{nombre}/{edad}")
    public ModelAndView request2(@PathVariable("nombre") String nombre, @PathVariable("edad") int edad)
    {
        ModelAndView mv = new ModelAndView("request");
        mv.addObject("user", nombre);
        return mv;
    }

    @GetMapping("/form")
    public ModelAndView showForm()
    {
        ModelAndView mv = new ModelAndView("formExample");
        mv.addObject("user", new User());
        return mv;
    }

    @PostMapping("/adduser")
    public ModelAndView addUser(@ModelAttribute("user")
                                            User user)
    {
        logger.info("El usuario recibido es "+ user);
       ModelAndView mav = new ModelAndView("addUser");
       mav.addObject("user", user);
       return  mav;

    }

    @GetMapping("/ejemploRedirect")
        public RedirectView redirect()
        {
            return new RedirectView("/form");
        }
}

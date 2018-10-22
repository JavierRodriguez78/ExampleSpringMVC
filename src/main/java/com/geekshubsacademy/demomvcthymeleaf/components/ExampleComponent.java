package com.geekshubsacademy.demomvcthymeleaf.components;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component("ExampleComponent")
public class ExampleComponent {
 private static final Log logger = LogFactory.getLog("ExampleComponent.class");

    public void newComponent(){
        logger.info("Estas ejecutando tu componente");

    }

}

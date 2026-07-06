package com.anurag.springboot_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootLearningApplication
{

    public static void main(String[] args)
    {

        /*
         * SpringApplication.run()
         *
         * 1. Creates IoC Container
         * 2. Component Scan Starts
         * 3. Finds @Component and @Service
         * 4. Creates Beans
         * 5. Injects Dependencies
         * 6. Starts Tomcat Server
         */

        ApplicationContext context =
                SpringApplication.run(SpringbootLearningApplication.class, args);

        System.out.println("--------------------------------");

        _4FieldInjectionService field =
                context.getBean(_4FieldInjectionService.class);

        field.start();

        System.out.println("--------------------------------");

        _5ConstructorInjectionService constructor =
                context.getBean(_5ConstructorInjectionService.class);

        constructor.start();

        System.out.println("--------------------------------");

        _6SetterInjectionService setter =
                context.getBean(_6SetterInjectionService.class);

        setter.start();

    }

}
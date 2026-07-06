package com.anurag.springboot_learning;

import org.springframework.stereotype.Service;

@Service
public class _5ConstructorInjectionService
{

    /*
     * CONSTRUCTOR INJECTION
     *
     * This is the MOST RECOMMENDED way.
     *
     * Spring sees that this constructor
     * requires a _1Student object.
     *
     * It searches inside the IoC Container.
     *
     * Student Bean Found
     *
     * Pass Student Bean to Constructor.
     *
     * Internally it behaves like:
     *
     * _1Student student = context.getBean(_1Student.class);
     *
     * new _5ConstructorInjectionService(student);
     */

    private final _1Student student;

    public _5ConstructorInjectionService(_1Student student)
    {
        this.student = student;

        System.out.println("Constructor Injection Service Bean Created");
    }

    public void start()
    {
        student.study();
    }

}
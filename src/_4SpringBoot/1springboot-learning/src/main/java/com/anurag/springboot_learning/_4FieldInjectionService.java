package com.anurag.springboot_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class _4FieldInjectionService
{

    /*
     * FIELD INJECTION
     *
     * Spring first creates this object.
     *
     * Then it looks for a Bean of type _1Student.
     *
     * It finds the Student Bean inside the IoC Container
     * and injects it into this variable.
     *
     * We NEVER write:
     *
     * _1Student student = new _1Student();
     *
     * Spring does it automatically.
     *
     * Field Injection is NOT recommended.
     */

    @Autowired
    private _1Student student;

    public _4FieldInjectionService()
    {
        System.out.println("Field Injection Service Bean Created");
    }

    public void start()
    {
        student.study();
    }

}
package com.anurag.springboot_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class _6SetterInjectionService
{

    private _1Student student;

    public _6SetterInjectionService()
    {
        System.out.println("Setter Injection Service Bean Created");
    }

    /*
     * SETTER INJECTION
     *
     * Spring first creates this object.
     *
     * After object creation,
     * Spring automatically calls this method.
     *
     * Internally it behaves like:
     *
     * service.setStudent(studentBean);
     */

    @Autowired
    public void setStudent(_1Student student)
    {
        this.student = student;
    }

    public void start()
    {
        student.study();
    }

}
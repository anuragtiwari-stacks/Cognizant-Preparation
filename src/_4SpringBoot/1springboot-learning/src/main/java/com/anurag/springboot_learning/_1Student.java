package com.anurag.springboot_learning;

import org.springframework.stereotype.Component;

@Component
public class _1Student
{
    // Constructor is called when Spring creates the Bean
    public _1Student()
    {
        System.out.println("Student Bean Created");
    }

    public void study()
    {
        System.out.println("Student is Studying...");
    }
}
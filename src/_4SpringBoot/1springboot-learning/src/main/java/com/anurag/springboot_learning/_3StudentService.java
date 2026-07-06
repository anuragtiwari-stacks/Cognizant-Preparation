package com.anurag.springboot_learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class _3StudentService
{

    @Autowired
    private _1Student student;

    public _3StudentService()
    {
        System.out.println("StudentService Created");
    }

    public void start()
    {
        student.study();
    }

}
package com.mythresh.RestDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Autowired
    private studentService service;
    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/getstudents")
    public List<Student> getStudents(){
        return service.getStudents();
    }
}

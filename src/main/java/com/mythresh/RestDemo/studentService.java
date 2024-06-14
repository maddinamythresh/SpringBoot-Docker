package com.mythresh.RestDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {

    @Autowired
    private studentRepo repo;

    public List<Student> getStudents(){
        return repo.findAll();
    }
    public void saveStudents(){

        Student s1=new Student();
        s1.setName("Rajesh");

        Student s2=new Student();
        s2.setName("Mythresh");


        repo.save(s1);
        repo.save(s2);
    }

}

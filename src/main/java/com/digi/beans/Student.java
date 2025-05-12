package com.digi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stud")
public class Student {

    @Autowired
    //@Qualifier("java")
    private CourseMaterial material;

    public void participate(String hackthonOrg){
        System.out.println("Hackathon stat for Organization :"+ hackthonOrg);
        String courseContent = material.courseContent();
        double price = material.price();
        System.out.println("Preparation for participate in Hackathon for Organization which name is :"+ hackthonOrg + " where :"+courseContent+" with price :"+ price);
       // System.out.println("Participate Organization name :" + hackthonOrg);
    }

}

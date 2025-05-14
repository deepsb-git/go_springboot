package com.digi.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;


@Named("stud")
    public final class Student {
        @Inject
        //@Qualifier("${course.choose}")
        @Named("courseId")
        private  CourseMaterial  material;  // HAS-A property

        public  void  preparation(String examName) {
            System.out.println("preparation started for  "+examName);
            String courseContent =material.courseContent();
            double price =material.price();
            System.out.println("preparation is going on using"+courseContent+" material  with price ::"+price);
            System.out.println("preparation is completed for "+examName);
        }

}

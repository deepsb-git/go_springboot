package com.digi.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named("java")
//@Primary
public final class JavaCourseMaterial implements CourseMaterial{

   /* public JavaCourseMaterial() {
        System.out.println("JavaCourseMaterial:: 0-param constructor");
    }*/

    public JavaCourseMaterial() {
        System.out.println("JavaCourseMaterial:: 0-param constructor");
    }

    @Override
    public String courseContent() {
        System.out.println("JavaCourseMaterial.courseContent()");
        return "1.DP,2.DS,3.DB";

    }

    @Override
    public double price() {
        System.out.println("JavaCourseMaterial.price()");
        return 5000;
    }
}

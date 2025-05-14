package com.digi.beans;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named("ui")
public final class UICourseMaterial implements CourseMaterial{

    public UICourseMaterial() {
        System.out.println("UICourseMaterial:: 0-param constructor");
    }

    @Override
    public String courseContent() {
        System.out.println("UICourseMaterial.courseContent()");
        return"1.DP,2.DS,3.DB";

    }

    @Override
    public double price() {
        System.out.println("UICourseMaterial.price()");
        return 2000;
    }
}

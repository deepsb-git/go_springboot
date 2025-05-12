package com.digi.beans;

import org.springframework.stereotype.Component;

@Component("net")
public final class NetCourseMaterial implements CourseMaterial{

    public NetCourseMaterial() {
        System.out.println("NetCourseMaterial:: 0-param constructor");
    }

    @Override
    public String courseContent() {
        System.out.println("NetCourseMaterial.courseContent()");
        return"1.DP,2.DS,3.DB";

    }

    @Override
    public double price() {
        System.out.println("NetCourseMaterial.price()");
        return 3000;
    }
}

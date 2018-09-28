package com.future.design.dependenceinversion;

/**
 * @author lizj
 */
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习java课程");
    }
}

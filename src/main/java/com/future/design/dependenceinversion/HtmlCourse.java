package com.future.design.dependenceinversion;

/**
 * @author lizj
 */
public class HtmlCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习前端课程");
    }
}

package com.future.design.dependenceinversion;

/**
 * @author lizj
 */
public class Geely {

    public void studyJavaCourse(){
        System.out.print("学习java课程");
    }

    public void studyHtmlCourse(){
        System.out.print("学习前端课程");
    }

    /**
     * 每次实现都需要新增
     */
    public void studyPythonCourse(){
        System.out.print("学习Python课程");
    }
}

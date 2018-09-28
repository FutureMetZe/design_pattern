package com.future.design.dependenceinversion;

/**
 * @author lizj
 */
public class Geely2 {

    private ICourse iCourse;

//    public Geely2(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

    public void studyCourse(){
        iCourse.studyCourse();
    }

    public ICourse getiCourse() {
        return iCourse;
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}

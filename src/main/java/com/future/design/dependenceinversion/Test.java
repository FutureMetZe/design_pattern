package com.future.design.dependenceinversion;

/**
 * 依赖倒置：核心思想，面向接口编程
 *      高层次模块不能依赖低层次模块
 * @author lizj
 */
public class Test {
    //v1
//    public static void main(String[] args) {
//        Geely geely = new Geely();
//        geely.studyJavaCourse();
//        geely.studyHtmlCourse();
//    }

    //v2面向借口
//    public static void main(String[] args) {
//        Geely2 geely2 =new Geely2();
//        geely2.studyCourse(new JavaCourse());
//        geely2.studyCourse(new HtmlCourse());
//        geely2.studyCourse(new CCourse());
//    }

    //v3 构造器方式
//    public static void main(String[] args) {
//        Geely2 geely2 = new Geely2(new JavaCourse());
//        geely2.studyCourse();
//    }

    public static void main(String[] args) {
        Geely2 geely2 =new Geely2();
        geely2.setiCourse(new JavaCourse());
        geely2.studyCourse();
    }
}

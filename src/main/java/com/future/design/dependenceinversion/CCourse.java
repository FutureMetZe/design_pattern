package com.future.design.dependenceinversion;

/**
 * @author lizj on 2018/9/28 0028 下午 9:11
 */
public class CCourse implements ICourse{

    @Override
    public void studyCourse() {
        System.out.println("学习C语言");
    }
}

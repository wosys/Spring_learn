package com.wintmain.spring5.collectiontype;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-18 13:07:02
 */
public class Course {
    private String cname;//课程名称
    public void setCname(String cname){
        this.cname=cname;
    }

    @Override
    public String toString() {
        return "Course{" + "cname='" + cname + '\'' + '}';
    }
}

package com.wintmain.spring5.bean;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-18 10:37:59
 */
public class Dept {
    private String dname;
    public void setDname(String dname){
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" + "dname='" + dname + '\'' + '}';
    }
}

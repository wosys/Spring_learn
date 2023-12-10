package com.wintmain.spring5.autowire;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-18 20:04:26
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" + "dept=" + dept + '}';
    }

    public void test() {
        System.out.println(dept);
    }
}

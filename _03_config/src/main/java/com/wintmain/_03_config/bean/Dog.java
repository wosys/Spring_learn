package com.wintmain._03_config.bean;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2023-01-02 13:50:10
 */
public class Dog {
    private String Name;
    private Integer Age;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Dog() {
    }

    public Dog(String name, Integer age) {
        Name = name;
        Age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}

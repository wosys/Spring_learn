package com.wintmain.spring5.collectiontype;

import java.util.List;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-18 18:49:15
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list){
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}

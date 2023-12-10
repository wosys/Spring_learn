package com.wintmain.spring5;

/**
 * @Description
 * @Author wintmain    <wosintmain@gmail.com>
 * @Date 2022-03-17 16:15:50
 */

/**
 * 使用有参数构造注入
 */
public class Orders {
    private String oname = "";
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest() {
        System.out.println(oname+"::"+address);
    }
}

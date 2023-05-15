package com.yichang.zidingyi;//自定义异常

/**
 * 自己定义的异常必须继承Exception或者RunException
 */
public class Test6 extends Exception{
    public Test6(String msg){
        super(msg);//调用父类的构造方法,Exception(msg)
    }

}

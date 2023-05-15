package com.yichang.zidingyi;

//创建场景
public class Test5 {
    public void man(Test4 p) throws Test6 {
        if(p.gender.equals("男")){
            System.out.println("OK");
        }else{
            //抛出异常
            throw new Test6("性别错误");
        }
    }
}

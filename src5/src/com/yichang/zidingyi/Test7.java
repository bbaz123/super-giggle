//执行区
package com.yichang.zidingyi;

public class Test7 {
    public static void main(String[] args) throws Test6 {
        Test4 p1 = new Test4("小张","男");
        Test4 p2 = new Test4("小花","女");

        Test5 zaotang = new Test5();

        zaotang.man(p1);
        zaotang.man(p2);
    }

}

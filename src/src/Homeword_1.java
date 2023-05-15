/**
 * 猜数字游戏
 */

import java.util.Random;
import java.util.Scanner;

public class Homeword_1 {
    public static void main(String[] args) {
        //生成随机数
        Random rd = new Random();
        int n = rd.nextInt(100);//n是随机数,范围0到99
        boolean flag = true;
        while (flag){
        Scanner sc =new Scanner(System.in);//用户输入
        System.out.println("请输入猜的数字");
        int a = sc.nextInt();//获取用户输入
        //判断
        if(a>n){
            System.out.println("偏大");
        } else if (a<n) {
            System.out.println("偏小");
        }else{
            System.out.println("猜对了");
            flag = false;
        }
    }
}
}

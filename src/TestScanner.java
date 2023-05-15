/**
 * 用户输入
 */

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        //1.创建一个扫描器
        /*
        Scanner sc = new Scanner(System.in);
         */
        //2.使用扫描器来获取到用户输入的内容

        /*
        int a = sc.nextInt(); //获取整数
        System.out.println(a);
         */
        /*
        double b = sc.nextDouble();//小数
        System.out.println("b="+b);
         */
        /*
        String c =sc.nextLine();//获取字符串
        System.out.println(c);
         */

        //让用户输入两个数,a,b,计算a+b的结果
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入A和B:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a+b="+ (a+b));
    }
}

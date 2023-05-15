/*
数值拆分：输入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
 */

import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        System.out.println("请输入三位数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100%10;
        System.out.println("这个数字的个位是"+ge);
        System.out.println("这个数字的十位是"+shi);
        System.out.println("这个数字的百位是"+bai);
    }
}

/*
将一个字符串 str 的内容颠倒过来，并输出。str 的长度不超过 100 个字符。 如：输入 “I am a student”，输出 “tneduts a ma I”。输入参数：inputString：输入的字符串返回值：输出转换好的逆序字符串
 */

import java.util.Scanner;

public class sei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i =str.length()-1;i>=0;i--){
            System.out.println(str.charAt(i));
        }
    }
}

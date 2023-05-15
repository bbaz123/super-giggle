/*
数据类型整数double举例
 */
public class var2 {
    public static void main(String[] args) {
        double price =1.25;//声明一个prince的小数变量
        System.out.println(price);
        System.out.println(price + 0.15);//price 原先值没变
        price =price+0.15;//表示赋值
        System.out.println(price);//price原先值改变
        price = price+0.01;
        System.out.println(price);
        double tottle =price * 3;// 声明变量,该变量的值是变量price的3倍，double类型的计算结果一般都是double类型
        System.out.println(tottle);
        System.out.println(price / 100);//除法
        System.out.println(price % 2);//余数
    }
}

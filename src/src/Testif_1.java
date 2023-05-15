import java.util.Scanner;

public class Testif_1 {
    public static void main(String[] args) {
        System.out.println("请告诉我有多少钱:");
        Scanner sc = new Scanner(System.in);//用户输入
        double money = sc.nextDouble();//获取钱
        double price = 1000;//商品所用价格
        if (money > price){
            System.out.println("可以购买");//if语句,条件判断
        }
        System.out.println("结束");
    }
}

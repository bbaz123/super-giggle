import java.util.Scanner;

public class Testif_2 {
    public static void main(String[] args) {
        System.out.println("请告诉我钱数");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double price = 1000;
        //判断
        if(money>price){
            System.out.println("可以购买");
        }else{
            System.out.println("不可购买");
        }
        System.out.println("结束");
    }
}

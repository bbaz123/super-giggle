import java.util.Scanner;

public class Testif_3 {
    public static void main(String[] args) {
        System.out.println("请告诉我钱数");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();

        if (money>1000){
            System.out.println("1000元商品");
        } else if (money>500) {
            System.out.println("500元商品");
        } else if (money>200) {
            System.out.println("200元商品");
        }else {
            System.out.println("失败");
        }
        System.out.println("结束");
    }
}

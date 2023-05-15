/*
打印出所有的水仙花数，所谓水仙花数是指一个三位数，其各位数字立方和等于该数本身。
 */
public class one {
    public static void main(String[] args) {
        for (int i =100;i<1000;i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%10;
            int sum = ge*ge*ge+shi*shi*shi+bai*bai*bai;
            if(sum == i){
                System.out.println("水仙花数为"+sum);
            }


        }
    }
}

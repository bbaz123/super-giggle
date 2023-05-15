/*
求 100 以内的奇数和，并把求和结果在控制台输出
 */
public class eite {
    public static void main(String[] args) {
        int num =0;
        for (int i=0;i<=100;i++){
            if (i%2==1){
                num =num+i;
            }
        }
        System.out.println(num);
    }
}

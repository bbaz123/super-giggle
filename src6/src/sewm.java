/*
打印 100 以内除了尾数为 3,5,7 的所有数
 */
public class sewm {
    public static void main(String[] args) {
        for (int i =0;i<=100;i++){
            int wei =i%10;
            if (wei!=3&&wei!=5&&wei!=7){
                System.out.println(i);
            }
        }

    }
}

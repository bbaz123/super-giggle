/*
求 100 以内的偶数和，并把求和结果在控制台输出
 */
public class five {
    public static void main(String[] args) {
        int num =0;
        for (int i =0;i<=100;i++){
            if(i%2==0){
                num = num+ i;
            }
        }
        System.out.println(num);
    }
}

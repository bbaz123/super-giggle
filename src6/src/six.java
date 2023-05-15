/*
打印九九乘法口诀
 */
public class six {
    public static void main(String[] args) {
        for (int i =1;i<=9;i++){
            for (int j =1;j<=i;j++){
                System.out.println(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println(" \t");
        }
    }
}

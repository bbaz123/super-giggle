public class nineli2 {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=2;i<=100;i++){
            for(j=2;j<=i/2;j++){
                if (i%j==0){
                    break;
                }
            }
            if (j>i/2){
                System.out.println(i);
            }
        }
    }
}

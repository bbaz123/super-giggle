public class nineli {
    public static void main(String[] args) {
        int[] x = new int[100];
        for (int i=1;i<100;i++)
            x[i]=i;
        for(int j=1;j<x.length;j++){
            boolean flag=true;
            for(int i=2;i<x[j];i++)
                if(x[j]%i == 0)flag = false;
            if (flag)
                System.out.print(x[j]+"");
        }
    }
}

public class Test {
    public static  void change(int b){
        b = 20;
    }

    public static void main(String[] args) {
        int a = 10;
        change(a);

        System.out.println(a);
    }
}

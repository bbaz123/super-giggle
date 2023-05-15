public class TestMethod4 {
    public static void chi(String fan){
        System.out.println("吃"+fan);
    }
    public static void chi(String fan,String cai){
        System.out.println("吃"+fan);
        System.out.println("吃"+cai);
    }

    public static void main(String[] args) {
        chi("大米饭");
        chi("小米饭","土豆");

    }
}

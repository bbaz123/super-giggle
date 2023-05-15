public class TestMethod3 {
    public static void fa1(String tools,String style){
        System.out.println("这"+ tools);
        System.out.println("这是"+ style);
        System.out.println("这是方" + style);
        System.out.println("这是方法"+tools);
    }

    public static void main(String[] args) {
        fa1("这是实参添加","2号参数");
        fa1("添加实参","2.2号参数");
    }
}

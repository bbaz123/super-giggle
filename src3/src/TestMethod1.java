public class TestMethod1 {
    /**
     * 定义了一个方法
     * 并没有进行调用
     */
    public static void fa1(){
        System.out.println("这");
        System.out.println("这是");
        System.out.println("这是方");
        System.out.println("这是方法");
    }
    public static void countic1(){
        for (int i =1;i <=100; i++){
            System.out.println(i);
        }
    }
    //主方法,主函数,程序的入口
    public static void main(String[] args) {
        System.out.println("第一次调用");
        //调用方法
        fa1();
        System.out.println("完成!");
        System.out.println("第二次调用");
        countic1();
        fa1();
        System.out.println("完成!");

    }
}

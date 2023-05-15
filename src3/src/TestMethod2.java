public class TestMethod2 {
    public static String buy(){
        System.out.println("购买商品");
        //需要return进行返回
        return "商品";//返回值类型和返回值必须匹配
    }
    public static void main(String[] args) {
//        buy();//没有接受返回值
        //返回值返回给调用方
        String b = buy();//接受返回值
        System.out.println("得到的返回值是"+ b);
    }
}

public class Test3 {
    public static void chu(int a,int b) throws Exception {
        if(b == 0){
            throw new Exception("b不能等于0"); // 真正的向外抛出异常
        }else {
            System.out.println(a/b);
        }
    }

    public static void main(String[] args) {
        try {
            chu(18,6);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

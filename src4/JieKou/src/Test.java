//测试
public class Test {
    public static void main(String[] args) {
//        Gold g = new Gold();//接口一样拥有多态性
//        g.getMoney();
        Panda  p = new Panda();
        Animal anl = new Panda();
        Valuable val = new Panda();

        anl.eat();
        p.getMoney();
        p.cang();
        p.eat();
        val.getMoney();

    }
}

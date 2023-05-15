//实现关系,接口和类之间的关系案例
public class Gold implements Valuable{
    //必须重写抽象方法
    public void getMoney(){
        System.out.println("黄金值钱");
    }
}

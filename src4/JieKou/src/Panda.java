//类可以继承类,实现多个接口
public class Panda extends Animal implements Protectable, Valuable{
    //可以一键生成
    @Override // 表示重写
    public void eat() {
        super.eat();
        System.out.println("熊猫吃竹子");
    }

    @Override
    public void cang() {
        System.out.println("把熊猫藏山里");
    }

    @Override
    public void getMoney() {
        System.out.println("熊猫可以换钱");
    }
}

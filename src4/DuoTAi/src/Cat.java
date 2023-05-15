//猫是动物 ->继承动物
public class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    //演示向下转型案例
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}

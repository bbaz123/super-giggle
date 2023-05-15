public class Client {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        Dog d = new Dog();
//        DaXiang x = new DaXiang();
//        Person p = new Person();
//        p.feedcat(c);
//        p.feedDog(d);
//        p.feedDaXiang(x);

//         Cat c = new Cat();//把猫当初猫来看,创建一只猫
        //多态:把不同的数据类型进行统一
        // 把子类的对象赋值给父类称为向上转型,屏蔽子类中特有的方法
        Animal animal1 = new Cat();//把猫当成动物来看,创建了一只猫
 //       animal1.catchMouse();//站在动物角度,不可以抓老鼠

        Animal animal2 = new Dog();
        Animal animal3 = new DaXiang();
//        Person p = new Person();
//        p.feed(animal1);
//        p.feed(animal2);
//        p.feed(animal3);
        //向下转型
        Cat cc = (Cat)animal1;//强制转化
        cc.catchMouse();//猫又可以抓老鼠了




    }
}

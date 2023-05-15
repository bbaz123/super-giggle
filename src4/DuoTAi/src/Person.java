import org.jetbrains.annotations.NotNull;

public class Person {
//    public void feedcat(@NotNull Cat c){
//        c.eat();
//    }
//    public void feedDog(@NotNull Dog d){
//        d.eat();
//    }
//    public void feedDaXiang(@NotNull DaXiang x){
//        x.eat();
//    }
    public void feed(Animal animal){
        animal.eat();//接收到的所有的动物都是Animal
    }
}

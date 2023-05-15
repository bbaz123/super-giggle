public class Cat extends Animal{
    public static void main(String[] args) {

        Animal ani = new Animal();
        if(ani instanceof Cat){
            System.out.println("是猫");
        }else {
            System.out.println("不是猫");
        }

        Animal C = new Cat();
        if( C  instanceof Cat){
            System.out.println("是猫");
        }else {
            System.out.println("不是猫");
        }
    }
}

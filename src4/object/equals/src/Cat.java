public class Cat {
    String name;
    String color;
    public Cat(String name, String color){
        this.color = color;
        this.name = name;
    }
    //重写equals判断方法
    public boolean equals(Cat c){
        if (this.color == c.color){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("小", "红色");
        Cat c2 = new Cat("小", "红色");

        System.out.println(c1 == c2 );//false,判断两个对象的内存地址是否一致
        System.out.println(c1.equals(c2)); // 默认调用object提供的equals方法

    }
}

/**
 * 能继承接口的只能是接口
 * 接口和类只能是实现关系 implements
 */
public interface Valuable {//接口使用interface来声明,已经不是类了
    //接口中所有的方法都是抽象方法,可以省略abstract
    //接口中所有的内容都是公开的
    //public abstract void getMoney();//可以省略public abstract
    void getMoney();
}

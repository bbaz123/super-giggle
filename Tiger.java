//定义一个类Tiger，表示老虎
class Tiger {
  //定义一个属性weight，表示体重
  int weight;
  
  //定义一个构造方法，用于创建老虎对象并初始化体重
  Tiger(int weight) {
    this.weight = weight;
  }
}

//定义一个主类Main，包含主方法
public class Main {
  //定义一个静态方法compare，用于比较两只老虎的体重是否相同，返回布尔值
  public static boolean compare(Tiger t1, Tiger t2) {
    //如果两只老虎的体重相等，返回true
    if (t1.weight == t2.weight) {
      return true;
    }
    //否则，返回false
    else {
      return false;
    }
  }
  
  //定义主方法，用于测试
  public static void main(String[] args) {
    //创建两只老虎对象，分别赋予180kg和200kg的体重
    Tiger tiger1 = new Tiger(180);
    Tiger tiger2 = new Tiger(200);
    
    //调用compare方法，比较两只老虎的体重是否相同，并打印结果
    System.out.println(compare(tiger1, tiger2));
  }
}

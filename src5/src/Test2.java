import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Test2 {
    //方法1   try....catch
    public static void read1(){
        try{
            InputStream is = new FileInputStream(new File("哈哈哈"));//生成异常的代码
        }catch (Exception e){
        }
    }

    //方法2 throws
    public static void read2() throws Exception{//表示当前这个方法会扔出Exception这样的错误,谁调用谁去处理
        InputStream is = new FileInputStream(new File("哈哈哈"));//生成异常的代码
    }

    //使用方法2
    public static void main(String[] args) throws Exception {
//        read2();// Alt+Enter可以快速处理
//        //处理方法1
//        try {
//            read2();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        //处理方法2
        read2();


    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println(1/0);//0不能做除数
        /**
         * 结果
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * 	at Test.main(Test.java:3)
         *
         * 	at Test.main(Test.java:3)中(Test.java:3)表示在Test.java文件的第3行出错
         *
         *
         */
    }
}

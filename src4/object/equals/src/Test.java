public class Test {
    public static void main(String[] args) {
        String str1 = "小红";
        String str2 = "小红";//第二个小红并没有单独占用空间

        System.out.println(str1 == str2);//内存地址一样

        System.out.println(str1.equals(str2));

        String str3 = new String("来");
        String str4 = new String("来");

        System.out.println(str3 == str4);//不是一个内存地址
        System.out.println(str3.equals(str4));//String里的equals判断两个字符串的内容是否一致

        //字符串的判断必须用equals
    }
}

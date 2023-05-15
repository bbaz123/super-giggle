public class TestWhile_1 {
    public static void main(String[] args) {
        /*
        //假设挂机刷怪(1.未加while)
        System.out.println("登录");

        System.out.println("进入地图");
        System.out.println("F1~~~~升级");//执行1次
        System.out.println("进入地图");
        System.out.println("F1~~~~升级");//执行2次
        System.out.println("进入地图");
        System.out.println("F1~~~~升级");//执行3次
        System.out.println("进入地图");
        System.out.println("F1~~~~升级");//执行4次

         */
        //利用while循环
        /*
        while (true){
            System.out.println("66666");//死循环
        }

         */
        /*
        //改变条件达到停下来的目的,避免死循环
        //喊10次666
        int i = 1;
        while(i<=10) {
            System.out.println("666");
            i = i + 1;
        }

         */

        //假设挂机刷怪(2.加入while)
        System.out.println("登录");
        int i = 1;
        while (i<=10) {
            System.out.println("进入地图");
            System.out.println("F1~~~~升级");
            i=i+1;
        }
        System.out.println("over");

    }
}

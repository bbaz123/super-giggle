/*
计算 2000 年 1 月 1 日到 2022 年 1 月 1 日相距多少天
 */

public class two {
    public static void main(String[] args) {
        int tian =0;
        int day;
        for (int n=2000;n<2008;n++){
            if(n%4==0&&(n&100)!=0||(n%400)==0){
                day=366;
            }else {
                day=365;
            }
            tian = tian+day;
        }
        System.out.println(tian);
    }
}

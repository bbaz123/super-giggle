public class Testarray {
    public static void main(String[] args) {
        int[] arr1 = new  int[5];
        int[] arr2 = {33,22,18,37};
       //             0   1  2   3
        int[] arr3 = new  int[]{33,22,11,10};

        //使用
        System.out.println(arr2[0]);// 从数组arr2中获取到位置0的数据
        //改变数组里的内容\
       arr2[1] = 88;//通过下标改变数组中的数据
        System.out.println(arr2[1]);
        //查看数组中所有的数据
        int[] arr4 = {66, 55, 89, 99, 15, 78 };
        for (int i =0 ; i<arr4.length; i++){// arr4.length 表示数组中有多少个数据  ->数组的长度
            System.out.println(i);
        }


    }
}

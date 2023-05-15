public class Testattay2 {
    public static void main(String[] args) {
        //找到数组中的最大值
        int[] arr1 = {1, 2, 55,77,88,99,44,55};
        int max =arr1[0];//先设定一个最大值
        for(int i =1; i < arr1.length; i ++){
            if (arr1[i] > max){
                max = arr1[i];
            }
        }
        System.out.println(max);

    }
}

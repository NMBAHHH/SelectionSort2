import java.util.Random;
// 生成乱序数组，用于检测算法复杂度
public class ArrayGenerator {
    private ArrayGenerator(){}
    public  static Integer[] generateOrderedArray(int n){
        Integer[] arr = new Integer[n];
        for (int i =0; i < n; i ++)
            arr[i] = i;
        return arr;
    }

    public static Integer[] generateRandomArray(int n, int top){
        Integer[] arr = new Integer[n];
        Random rnd = new Random();
        for (int i =0; i < n; i ++)
            arr[i] = rnd.nextInt(top);
        return arr;
    }
}

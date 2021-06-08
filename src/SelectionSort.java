public class SelectionSort {
    //static变量不依赖于类的任何实例，只要类被加载(加载不等于实例化)
    public  static <E extends  Comparable <E>> void sort(E[] arr){
        //两个循环 分割[0,i),[i,n)
        for(int i=0 ; i < arr.length; i++){
            int miniIndex = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j].compareTo(arr[miniIndex])<0)
                    miniIndex = j;
            }
        swop(arr,i,miniIndex);
        }

    }

    public static <E> void swop(E[] arr, int i, int j){
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] iii){
/*        Integer[] arr={3,2,7,88,1,5};
        SelectionSort.sort(arr);
        for(int e:arr)
            //此处”“ 如果使用单引号，因为强制类型转换，会把char型空格转为ascii的32再相加
            System.out.print(e+" ");
        System.out.println();*/

        int n = 10000;
        Integer[] arr = ArrayGenerator.generateRandomArray(n, n);

        long startTime = System.nanoTime();
        SelectionSort.sort(arr);
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;

        System.out.println(time);

    }

}

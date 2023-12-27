package sort;

import java.util.Arrays;

public class SelectSorting {
    public static void main(String[] args) {
        int[] arr = new int[]{1,-3,2,10,8,9};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //选择排序
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i]; //将第一个位置的数当做最小元素
            int minIndex = i;//保存最小元素的下标
            for (int j = i+1; j < arr.length; j++) {
                //找到剩余元素中最小的元素
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            //进行交换
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
    }
}

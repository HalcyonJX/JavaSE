package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = {1, -3, -4, 2, 43, 12, 20};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //冒泡排序
    public static void bubbleSort(int[] arr){
        int temp = 0; //保存临时变量，用于交换
        boolean flag = false; //标记每轮是否发生交换
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }else {
                flag = false;
            }
        }
    }
}
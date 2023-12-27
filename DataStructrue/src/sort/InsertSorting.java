package sort;

public class InsertSorting {
    public static void main(String[] args) {

    }
    // 插入排序
    public static void insertSort(int[] arr){
        int insertVal = 0;
        int insertIndex = 0;
        //左边有序表，右边无序表，开局默认第一个元素为有序表
        for (int i = 1; i < arr.length; i++) {
            insertVal = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && insertVal <arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            //判断是否需要插入
            if(insertIndex + 1 != i){
                arr[insertIndex+1] =insertVal;
            }
        }
    }
}

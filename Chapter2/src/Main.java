import java.util.Arrays;

public class Main {
    public static int findSmallest(int[] arr){
        int small = arr[0];
        int small_index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < small){
                small = arr[i];
                small_index = i;
            }
        }
        return small_index;
    }

    public static int[] selectionSort(int[] arr){
        int[] newArr = new int[arr.length];
        int[] tempArr = arr.clone();
        for (int i = 0; i < newArr.length; i++){
            int small_index = findSmallest(tempArr);
            newArr[i] = tempArr[small_index];
            int[] newTemp = new int[tempArr.length - 1];
            for (int j = 0, k = 0; j < tempArr.length; j++) {
                if (j != small_index) {
                    newTemp[k++] = tempArr[j];
                }
            }
            tempArr = newTemp;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 6, 2, 10};
        int[] sortedArray = selectionSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
package sortingAlg;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++){
            int tmp = arr[i];
            int j = i -1;

            while (j>=0 && arr[j] > tmp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = tmp;

        }

    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}

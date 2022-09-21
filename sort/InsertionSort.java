package sort;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] arr) {
        int idx = 0; // the index of the evaluated item, this item will be compared with all the items on the left
        int temp = 0; // This temp value will be used in case we need to substitute an element

        for (int i = 0; i < arr.length - 1; i++) {
            idx = i + 1;

            while (idx > 0) {
                if (arr[idx] < arr[idx - 1]) {
                    temp = arr[idx - 1];
                    arr[idx - 1] = arr[idx];
                    arr[idx] = temp;
                }
                idx--;
            }

        }
        return arr;
    }


    public static void main(String... args) {
        int[] arr1 = {4, 3, 5, 6, 7, 3, 6, 4, 3, 8, 0};
        int[] arr2 = {7, 4, 3, 6, 9, 1, 0, 6, 5, 1, 8};
        int[] arr3 = {4, 3, 5, 6, 7, 1, 0, 6, 5, 1, 0};

        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sort(arr1)));
        System.out.println(Arrays.toString(insertionSort.sort(arr2)));
        System.out.println(Arrays.toString(insertionSort.sort(arr3)));
    }
}
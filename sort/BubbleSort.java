package sort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int[] arr) {
        boolean needSwap = true;
        int temp = 0;

        while (needSwap) {
            int swaps = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swaps++;
                }
            }
            System.out.println("Swaps: " + swaps);

            if (swaps == 0) {
                needSwap = false;
            }
        }

//        int n = arr.length;
//        for (int i = 0; i < n - 1; i++) {
//            int swaps = 0;
//            for (int j = 0; j < n - i - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // swap arr[j+1] and arr[j]
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                    swaps++;
//                }
//            }
//            System.out.println("Swaps: " + swaps);
//        }

        return arr;
    }

    public static void main(String... args) {
        int[] arr1 = {4, 3, 5, 6, 7, 3, 6, 4, 3, 8, 0};
        int[] arr2 = {7, 4, 3, 6, 9, 1, 0, 6, 5, 1, 8};
        int[] arr3 = {4, 3, 5, 6, 7, 1, 0, 6, 5, 1, 0};

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(arr1)));
        System.out.println(Arrays.toString(bubbleSort.sort(arr2)));
        System.out.println(Arrays.toString(bubbleSort.sort(arr3)));
    }
}

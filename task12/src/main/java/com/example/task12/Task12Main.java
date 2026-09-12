package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int temp = 0;
        if (arr != null && arr.length > 0) {
            for (int i =0; i < arr.length; i++ ){
                int minInd = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < arr[minInd]) {
                        minInd = j;
                    }
                }
                temp = arr[i];
                arr[i] = arr[minInd];
                arr[minInd] = temp;
            }
        }
    }

}
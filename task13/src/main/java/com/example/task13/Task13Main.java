package com.example.task13;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task13Main {
    public static void main(String[] args) {

        int[] arr = {9, 1100, 7, 8};
        System.out.println(java.util.Arrays.toString(removeMoreThen1000(arr)));
    }

    static int[] removeMoreThen1000(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
            if (arr != null && arr.length > 0) {
                for (int number : arr) {
                    if (number <= 1000) {
                        result.add(number);
                    }
                }
                int[] answer = new int[result.size()];
                for (int i = 0; i < result.size(); i++) {
                    answer[i] = result.get(i);
                }
                return answer;
            }
            return arr;
    }

}
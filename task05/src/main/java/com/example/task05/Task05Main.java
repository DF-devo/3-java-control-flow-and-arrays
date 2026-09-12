package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        System.out.println(getMin(5,4,3));
    }

    static int getMin(int a, int b, int c) {
        int[] numbers = {a,b,c};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min){
                min  = numbers[i];
            }
        }
        return min;
    }
}
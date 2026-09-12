package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        System.out.println(getMax(1, 2, 3, 4));

    }

    static int getMax(int a, int b, int c, int d) {
        int[] numbers = {a,b,c,d};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max  = numbers[i];
            }
        }
        return max;
    }

}
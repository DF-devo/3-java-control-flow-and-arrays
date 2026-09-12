package com.example.task03;

import java.util.Map;

public class Task03Main {
    public static void main(String[] args) {
        System.out.println(getNameOfWeekDays(7));
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        Map<Integer, String> week= Map.ofEntries(
                Map.entry(1, "понедельник"),
                Map.entry(2, "вторник"),
                Map.entry(3, "среда"),
                Map.entry(4, "четверг"),
                Map.entry(5, "пятница"),
                Map.entry(6, "суббота"),
                Map.entry(7, "воскресенье")
        );
        if (weekDaysNumber < 1 || weekDaysNumber > 7){
            return "такого дня недели не существует";
        }
        else{
            return week.get(weekDaysNumber);
        }
    }
}
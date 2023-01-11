package com.bridgelabz;

import java.util.Arrays;

public class Duplicate_Arr {
    public static void main(String[] args) {
        int[] numbers = new int[]{98, 67, 21, 21, 4, 5, 66, 5, 4, 9};
        System.out.println("Duplicate elements are: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println(numbers[j]);
                    //Arrays.stream(numbers).sorted();
                }
            }
        }
    }
}

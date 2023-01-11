package com.bridgelabz;

public class Even_Position {
    public static void main(String[] args) {

        int [] arr ={1, 2, 3, 4, 5};
        System.out.println("Elements of even position are : ");
        for (int i = 1; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
}

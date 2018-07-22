package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.nextInt();
        }

        countReps(arr);
    }

    public static int countReps(int[] arr) {
        int n = 1, v = 0, maxCount = 0;
        for (int i = 1; i < 10; i++) {
            if (arr[i] == arr[i - 1]) {
                n++;
            }
            else n=0;

            if (maxCount < n) {
                maxCount = n;
                v = arr[i];
            }

        }

        System.out.println("Integer from the longest recurring sequence is:");
        System.out.println(v);
        return (v);
    }
}

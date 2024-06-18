package com.example.Easy;

import java.util.Scanner;

public class QSort {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Write length: ");
        int length = scn.nextInt();

        int arrays[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Write numbers: ");
            arrays[i] = scn.nextInt();
        }

        qSort(arrays, 0, arrays.length - 1);

        for (int i : arrays) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum of elements: " + elemSum(arrays));
        System.out.println("Highest element: " + highSum(arrays));
    }

    protected static void qSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    protected static int elemSum(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        return elemSumRecursive(arr, arr.length - 1);
    }

    private static int elemSumRecursive(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + elemSumRecursive(arr, index - 1);
    }

    protected static int highSum(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return 0;
        }
        int highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }
}

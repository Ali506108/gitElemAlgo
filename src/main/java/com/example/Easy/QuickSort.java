package com.example.Easy;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 77, 2, 65, 7, 90};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // Рекурсивно сортируем элементы до разделителя
            quickSort(arr, pi + 1, high); // Рекурсивно сортируем элементы после разделителя
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Выбираем последний элемент как опорный
        int i = (low - 1); // Индекс меньшего элемента

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Меняем местами arr[i] и arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Меняем местами arr[i+1] и arr[high] (или опорный элемент)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Возвращаем индекс опорного элемента
    }
}

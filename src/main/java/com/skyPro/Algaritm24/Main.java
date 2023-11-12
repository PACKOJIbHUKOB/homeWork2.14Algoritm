package com.skyPro.Algaritm24;
import com.skyPro.Algaritm24.Interface.IntegerList;
import com.skyPro.Algaritm24.Service.SortedIntegerListImpl;
import com.skyPro.Algaritm24.Utils.SortedUtil;


import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            findFastedSortMethod();
        }
        private static void findFastedSortMethod() {
            Integer[] arr = generateRandomArray();
            System.out.println("Bubble sort");
            long start = System.currentTimeMillis();
            SortedUtil.bubbleSort(arr);
            System.out.println(System.currentTimeMillis() - start + " ms.");

            Integer[] arr2 = generateRandomArray();
            System.out.println("Selection sort");
            start = System.currentTimeMillis();
            SortedUtil.selectionSort(arr2);
            System.out.println(System.currentTimeMillis() - start);

            Integer[] arr3 = generateRandomArray();
            System.out.println("Insertion sort");
            start = System.currentTimeMillis();
            SortedUtil.insertionSort(arr3);
            /*System.out.println(Arrays.toString(arr3));*/
            System.out.println(System.currentTimeMillis() - start + "ms");

        }
    public static Integer[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        Integer[] arr = new Integer[100000];
        for (Integer i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    }


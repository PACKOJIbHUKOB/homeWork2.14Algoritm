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
            IntegerList integerList = new SortedIntegerListImpl(5);
            integerList.add(9);
            integerList.add(51);
            integerList.add(126);
            integerList.add(1489);
            integerList.add(951);
            System.out.println("Bubble sort");

            long start = System.currentTimeMillis();
            System.out.println(Arrays.toString(SortedUtil.bubbleSort(Arrays.copyOf(integerList.toArray(), integerList.size()))));
            System.out.println(System.currentTimeMillis() - start + " ms.");
            IntegerList integerList2 = new SortedIntegerListImpl(5);
            integerList2.add(9);
            integerList2.add(1489);
            integerList2.add(126);
            integerList2.add(51);
            integerList2.add(951);
            System.out.println("Selection sort");

            start = System.currentTimeMillis();
            System.out.println(Arrays.toString(SortedUtil.selectionSort(Arrays.copyOf(integerList2.toArray(), integerList2.size()))));
            System.out.println(System.currentTimeMillis() - start + " ms.");
            IntegerList integerList3 = new SortedIntegerListImpl(5);
            integerList3.add(9);
            integerList3.add(51);
            integerList3.add(126);
            integerList3.add(1489);
            integerList3.add(951);
            System.out.println("Insertion sort");

            start = System.currentTimeMillis();
            System.out.println(Arrays.toString(SortedUtil.insertionSort(Arrays.copyOf(integerList3.toArray(), integerList3.size()))));
            System.out.println(System.currentTimeMillis() - start + " ms.");
        }
    }


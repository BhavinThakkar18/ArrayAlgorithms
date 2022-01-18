package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static Integer linearSearch(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                return item;
            }
        }
        return null;
    }

    public static java.util.OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findAny();
    }

    public static boolean binarySearch(int[] arr, int item) {
        int min = 0;
        int max = arr.length - 1;
        Arrays.sort(arr);
        while (min <= max) {
            int mid = (min + max) / 2;
            if (arr[mid] == item) {
                return true;
            } else if (arr[mid] > item) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
    public static ArrayList<Integer> findEvenNums(int[]arr1, int[]arr2){
        ArrayList<Integer> ansArray = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]%2==0)
            {
                ansArray.add(arr1[i]);
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]%2==0)
            {
                ansArray.add(arr2[i]);
            }
        }
        return ansArray;
    }
    public static void main(String[] args) {
	// write your code here
        int[] arr={2,1,4,3,5};
//        System.out.println(linearSearch(arr,1));
//        System.out.println(linearSearch(arr,8));
//        linearSearch2(arr,1).ifPresent(System.out::println);
//        linearSearch2(arr,8).ifPresent(System.out::println);
//        System.out.println(binarySearch(arr,3));
//        System.out.println(binarySearch(arr,1));
//        System.out.println(binarySearch(arr,8));
        System.out.println(findEvenNums(new int[]{9, 3, 2, -8, 12, -16},new int[]{0,-3,-8,-35,40,20,7}));
    }
}

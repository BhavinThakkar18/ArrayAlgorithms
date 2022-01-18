package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static Integer linearSearch(int [] arr,int item)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==item)
            {
                return item;
            }
        }
        return null;
    }
    public static java.util.OptionalInt linearSearch2(int[] arr, int item)
    {
        return Arrays.stream(arr).filter(x->x==item).findAny();
    }
    public static boolean binarySearch(int[] arr,int item)
    {
        int min =0;
        int max= arr.length-1;
        Arrays.sort(arr);
        while(min<=max)
        {
            int mid=(min+max)/2;
            if(arr[mid]==item)
            {
                return true;
            }
            else if(arr[mid]>item)
            {
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
	// write your code here
        int[] arr={2,1,4,3,5};
//        System.out.println(linearSearch(arr,1));
//        System.out.println(linearSearch(arr,8));
//        linearSearch2(arr,1).ifPresent(System.out::println);
//        linearSearch2(arr,8).ifPresent(System.out::println);
        System.out.println(binarySearch(arr,3));
        System.out.println(binarySearch(arr,1));
        System.out.println(binarySearch(arr,8));
    }
}

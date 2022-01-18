package com.company;

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

    public static void main(String[] args) {
	// write your code here
        int[] arr={1,2,3,4,5};
        System.out.println(linearSearch(arr,1));
        System.out.println(linearSearch(arr,8));
        linearSearch2(arr,1).ifPresent(System.out::println);
        linearSearch2(arr,8).ifPresent(System.out::println);
    }
}

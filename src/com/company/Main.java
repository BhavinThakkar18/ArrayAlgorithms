package com.company;

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

    public static void main(String[] args) {
	// write your code here
        int[] arr={1,2,3,4,5};
        System.out.println(linearSearch(arr,1));
        System.out.println(linearSearch(arr,8));
    }
}

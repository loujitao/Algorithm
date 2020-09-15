package com.steve.sort;

import java.util.Arrays;

/**
 * @Description: 快排方式   冒泡排序的一种改进
 * @Author: SteveTao
 * @Date: 2020/9/1514:43
 **/
public class QuickSort {

    //一趟排序，将数据分割成两部分，其一部分所有数据都小于另一部分
    //再将两部分数据分别进行快速排序
    private static void quickSort(int[] n,int left,int right){
        int dp;
        if(left< right){
            dp = partition(n,left,right);
            quickSort(n,left,dp-1);
            quickSort(n,dp+1,right);
        }
    }
    private static int partition(int[] n,int left,int right){
        int pivot = n[left];
        while (left < right){
            while (left < right && n[right]>= pivot)
                right--;
            if(left<right)
                n[left++]= n[right];
            while (left< right && n[left]<= pivot)
                left++;
            if(left < right)
                n[right--] = n[left];
        }
        n[left] =pivot;
        return left;
    }

    public static void main(String[] args) {
        int[] ints={2,56,34,21,24,11,23};
        System.out.println(Arrays.toString(ints));
        quickSort(ints,0, ints.length-1);
        System.out.println(Arrays.toString(ints));
    }

}

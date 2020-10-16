package com.steve.sort;

import java.util.Arrays;

/**
 * @Author Loujitao
 * @Time  13:55
 * @Description:简单选择排序
 * (如果每次比较都交换，那么就是交换排序；
 * 如果每次比较完一个循环再交换，就是简单选择排序。)
 *
 * 冒泡排序的改进版本，减少了数值交换的次数；
 * 内循环完成后，找到未排序数值中最小值，才交换一次数值。
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] a = {1,100,234,44,3,2,4,5};
        selectSort( a);
    }

    /**
     * 首先确定循环次数，并且记住当前数字和当前位置。
     * 将当前位置后面所有的数与当前数字进行对比，小数赋值给key，并记住小数的位置。
     * 比对完成后，将最小的值与第一个数的值交换。
     */
    public static void selectSort(int[]a){
        int len=a.length;
        for(int i=0;i<len;i++){//循环次数
            int position=i;
            for(int j=i+1;j<len;j++){//找到最小的值和位置
                if(a[j]<a[position]){
                    position=j;
                }
            }

            //进行交换
            int value=a[position];
            a[position]=a[i];
            a[i]=value;

            System.out.println(Arrays.toString(a));
        }
    }

}
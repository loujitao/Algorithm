package com.steve.sort;

import java.util.Arrays;

/**
 * @Description: 插入排序
 * @Author: SteveTao
 * @Date: 2020/9/1514:17
 *
 *  适合局部有序的数据排序， 下来while循环条件为假的次数多，相当于只有一层循环
 **/
public class InsertSort {

//    这个算法从数组的第二个元素开始循环，将选中的元素与之前的元素一一比较，
//    如果选中的元素小于之前的元素，则将之前的元素后移，
//    最后再将选中的元素放在合适的位置。
//    在这个算法执行的过程中，总是保持着索引i之前的数组是升序排列的。
    public static void insertSort(int[] intArr){
        for (int i = 1; i < intArr.length; i++) {
            int currentInt=intArr[i];
            int j=i-1;
            while (j>0&&intArr[j]>currentInt){
                intArr[j+1]=intArr[j];
                j--;
            }
            intArr[j+1]=currentInt;
        }

    }

    public static void main(String[] args) {
        int[] ints={2,56,34,21,24,11,23};
        System.out.println(Arrays.toString(ints));
        insertSort(ints);
        System.out.println(Arrays.toString(ints));
    }
}

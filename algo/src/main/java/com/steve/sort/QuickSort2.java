package com.steve.sort;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Description: 快排方式   冒泡排序的一种改进
 * @Author: SteveTao
 * @Date: 2020/9/1514:43
 **/
public class QuickSort2 {

    //一趟排序，将数据分割成两部分，其一部分所有数据都小于另一部分
    //再将两部分数据分别进行快速排序
    //利用系统的栈stack排序
    private  static  void quickSort(int[] array){
        if(array==null || array.length==1) return;
        //存放开始和结束索引
        Stack<Integer> s=new Stack<>();
        //压栈
        s.push(0);
        s.push(array.length-1);
        //利用循环实现
        while (!s.empty()){
            int right = s.pop();
            int left = s.pop();
            //如果最大索引小于等于左边索引，说明结束了
            if(right<= left) continue;

            int i= partition(array, left,right);
            if(left < i-1){
                s.push(left);
                s.push(i-1);
            }
            if(i+1 < right){
                s.push(i+1);
                s.push(right);
            }
        }
    }

    private static int partition(int[] n, int first, int end){
        int temp;
        int i=first, j=end;
        if(first<end){
            temp=n[i];
            //当i=j的时候，则说明扫描完成了
            while (i<j){
                //从右边向左边扫描，找到一个小于temp的元素
                while (j>i && n[j]>temp) j--;
                if(i<j){
                    //将该元素赋值给temp
                    n[i] = n[j];
                    //赋值后就应该将i+ 指向下一个序号
                    i++;
                }
                //然后从左边向右边开始扫描，找到一个大于temp的元素
                while (i<j && temp> n[i]) i++;
                if(i<j){
                    //将该元素赋值给temp
                    n[j] = n[i];
                    //赋值后就应该将j-1指向前一个序号
                    j--;
                }
            }
            //将轴数据放在i位置中
            n[i] = temp;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] ints={2,56,34,21,24,11,23};
        System.out.println(Arrays.toString(ints));
        quickSort(ints);
        System.out.println(Arrays.toString(ints));
    }

}

package com.steve.array;

/**
 * @Description: 数组的二分查找
 * @Author: SteveTao
 * @Date: 2020/9/1510:57
 **/
public class Array2find {

    public static void main(String[] args) {
        //前提是有序数组 升序
        int[] ints={2,5,9,11,35,41,52,66,69,73,75,88,91};

        System.out.println("数组长度："+ints.length);
//        int index = defaultFindIndex(75, ints);
        int index = findIndex(91, ints);
        System.out.println("数值在数组中的下标为："+index);

    }

    //二分查找的思路，这里按升序数组逻辑
    private static int findIndex(int searchKey,int[] intArr){
        int left=0;
        int right=intArr.length;
        int middle;
        while (true) { //会不会有死循环？ 未做验证
            //可以引入计数器i++，统计次数大于数组长度就退出return，规避死循环
            //二分查找的次数，绝对不会超过普通遍历的次数（即数组长度）
            System.out.println("===查找一次===");
            middle=(left+right)/2;
            if (intArr[middle]==searchKey){
                return middle;
            }else if(left>=right){
                //数组中没有该值
                return -1;
            }else {
                if(intArr[middle]<searchKey){
                    left=middle;
                }else {
                    right=middle;
                }
            }
        }
    }


    //通常考虑到的遍历对比，思路简单清晰，但比较耗时
    private static int defaultFindIndex(int searchKey,int[] intArr) {
        int index=-1;  //查询不到返回-1
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("===查找一次===");
            if (searchKey==intArr[i]){
                index=i;
            }
        }
        return index;
    }


}

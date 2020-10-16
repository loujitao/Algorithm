package com.steve.Queue.arrayQueue;

/**
 * @Description: 利用数组实现 队列 的数据结构
 *                 有界队列
 * @Author: SteveTao
 * @Date: 2020/10/1516:53
 **/
public class MyQueue {

    private int maxSize;        //最大长度
    private long[] queArray;
    private int front;          //队列头部
    private int rear;           //队列尾部
    private int nItems;         //包含元素个数

    public MyQueue(int size){
        maxSize = size;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    //加入队列
    public void insert(long j){
        if(rear == maxSize-1){
            rear =-1;
        }
        queArray[++rear] = j;
        nItems++;
    }

    //从队列头部移除一个元素
    public long remove(){
        long temp = queArray[front++];
        if(front == maxSize){
            front =0;
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queArray[front];
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return nItems==0;
    }

    //判断队列是否满了
    public boolean isFull(){
        return nItems == maxSize;
    }

    //获取队列的大小
    public int size(){
        return nItems;
    }

}

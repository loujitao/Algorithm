package com.steve.Queue.arrayQueue;

/**
 * @Description: 队列， 先进先出
 * @Author: SteveTao
 * @Date: 2020/10/169:42
 **/
public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);

        myQueue.remove();   //移除 1
        myQueue.remove();   //移除 2

        while (!myQueue.isEmpty()){
            long l = myQueue.remove();
            System.out.println("value :" + l);
        }

    }

}

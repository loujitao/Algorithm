package com.steve.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Description: TODO
 * @Author: SteveTao
 * @Date: 2020/9/1516:48
 **/
public class BlockingQueueTest {

    public static void main(String[] args) {
        function01();
    }

    /**
     * @Author Loujitao
     * @Description: ArrayBlockingQueue的底层使用的是ReentrantLock重入锁
     * 而且是默认false，然后走sync = fair ? new FairSync() : new NonfairSync();的非公平锁
     */
    public static void function01() {
        BlockingQueue bq = new ArrayBlockingQueue(5);
        //producer是一个线程任务类，执行的方法是往队列里放10条数据
        Producer producer = new Producer(bq);
        //consumer是线程任务类，执行方法是往队列里拿数据   他两的队列是同一个队列，
        Cunsumer cunsumer = new Cunsumer(bq);

        new Thread(producer).start();
        new Thread(cunsumer).start();

    }
}

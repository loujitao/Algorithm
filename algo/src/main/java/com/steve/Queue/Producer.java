package com.steve.Queue;

import java.util.concurrent.BlockingQueue;

/**
 * @Description: TODO
 * @Author: SteveTao
 * @Date: 2020/9/1516:46
 **/
public class Producer implements Runnable{
    private BlockingQueue MQList=null;

    public Producer(BlockingQueue MQList) {
        this.MQList = MQList;
    }

    @Override
    public void run() {
        try {
            for (int a=1;a<10;a++){
                //这里我让线程休眠0.5s，因为从数据库查询数据或者操作数据都是耗时的
                Thread.sleep(500);
                String str=Thread.currentThread().getName();
                MQList.put(str+"的"+a);
                System.out.println("生产者"+str+"存放了"+a);
            }
            System.out.println("生产者生产完成消息了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

package com.steve.Queue.linkQueue;

/**
 * @Description: TODO
 * @Author: SteveTao
 * @Date: 2020/10/1615:31
 **/
public class LinkQueueTest {

    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.insert(10);
        linkQueue.insert(20);
        linkQueue.insert(30);
        linkQueue.insert(40);
        linkQueue.printQueue();
        while (!linkQueue.isEmpty()){
            long l = linkQueue.remove();
            System.out.println(l);
        }
    }
}

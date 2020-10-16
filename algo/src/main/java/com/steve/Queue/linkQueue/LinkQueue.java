package com.steve.Queue.linkQueue;

/**
 * @Description: 利用链表的方式实现队列
 * @Author: SteveTao
 * @Date: 2020/10/1615:28
 **/
public class LinkQueue {

    private LinkList linkList;

    public LinkQueue(){
        linkList = new LinkList();
    }

    public boolean isEmpty(){
        return linkList.isEmpty();
    }

    public void insert(long j){
        linkList.insertLast(j);
    }

    public long remove(){
        return linkList.deleteFirst();
    }

    public void printQueue(){
        System.out.println("LinkQueue :");
        linkList.printList();
    }

}

package com.steve.link;

/**
 * @Description: 双向链表
 * @Author: SteveTao
 * @Date: 2020/10/1616:26
 **/
public class DoubleLinkList {


}

class DoubleNode{
    public  long data;

    public  DoubleNode next;        //下一个节点指针
    public DoubleNode previous;     //上一个节点指针

    public  DoubleNode(long d){
        data = d;
        next =null;
        previous = null;
    }

    public void printIt(){
        System.out.println("data: "+data);
    }
}
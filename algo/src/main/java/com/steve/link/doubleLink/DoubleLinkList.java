package com.steve.link.doubleLink;

/**
 * @Description: 双向链表
 *
 *      从头部插入、删除
 *
 * @Author: SteveTao
 * @Date: 2020/10/1616:26
 **/
public class DoubleLinkList {

    private DoubleNode first;
    private DoubleNode last;

    public DoubleLinkList(){
        first = null;
        last = null;
    }

    //判断是否为空链表
    public boolean isEmpty(){
        return first == null;
    }

    /**
     * 指针：  first    pre-next    last
     *
     * 链表：   |       |==|           |
     *
     */

    //从头部插入元素
    public void insertFirst(long d){
        DoubleNode newNode = new DoubleNode(d);
        if(isEmpty()){
            last = newNode;
        }else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    //从头部删除元素
    public DoubleNode deleteFirst(){
        DoubleNode tmp= first;
        if (first.next == null){
            last = null;
        }else {
            first.next.previous = null;
        }
        first = first.next;
        return tmp;
    }

    //从尾部插入元素
    public void insertLast(long d){
        DoubleNode newNode = new DoubleNode(d);
        if(isEmpty()){
            first = newNode;
        }else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    //从尾部删除元素
    public DoubleNode deleteLast(){
        DoubleNode tmp = last;
        if(first.next == null){
            first = null;
        }else {
            last.previous.next = null;
        }
        last = last.previous;
        return tmp;
    }

    //在某个元素后面插入元素
    public boolean insertAfter(long key, long d){
        DoubleNode current = first;
        while (current.data != key){
            current = current.next;
            if (current == null){
                return false;
            }
        }

        DoubleNode newNode = new DoubleNode(d);
        if(current == last){
            newNode.next=null;
            last = newNode;
        }else {
            newNode.next = current.next;
            current.next.previous = newNode;
        }
        newNode.previous = current;
        current.next = newNode;
        return true;
    }

    //删除某个元素
    public  DoubleNode deleteKey(long key){
        DoubleNode current = first;
        while (current.data != key){
            current = current.next;
            if (current == null){
                return null;
            }
        }

        if(current == first){
            first = current.next;
        }else {
            current.previous.next = current.next;
        }

        if (current == last){
            last = current.previous;
        }else{
            current.next.previous = current.previous;
        }
        return  current;
    }

    //从头开始遍历打印
    public  void  printFromHead(){
        System.out.println("first --> last:");
        DoubleNode current = first;
        while (current!=null){
            current.printIt();
            current =current.next;
        }
    }

    //从尾部向前遍历
    public void  printFromTail(){
        System.out.println("last --> first:");
        DoubleNode current = last;
        while (current !=null ){
            current.printIt();
            current = current.previous;
        }
    }

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
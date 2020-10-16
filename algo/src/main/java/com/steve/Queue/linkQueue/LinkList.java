package com.steve.Queue.linkQueue;

/**
 * @Description: TODO
 * @Author: SteveTao
 * @Date: 2020/10/1615:19
 **/
public class LinkList {

    private Node first;
    private Node last;

    public LinkList(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return  first == null;
    }

    public void insertLast(long d){
        Node newNode = new Node(d);
        if(isEmpty()){
            first = newNode;
        }else {
            last.next = newNode;
        }
        last = newNode;
    }

    public long deleteFirst(){
        long temp = first.data;
        if(first.next == null){
            last =null;
        }
        first = first.next;
        return temp;
    }

    public void printList(){
        Node current = first;
        while (current != null){
            current.printIt();
            current = current.next;
        }
    }

}

class Node{
    public long data;
    public Node next;

    public Node(long d){
        data = d;
    }

    public void printIt(){
        System.out.println("data: "+data);
    }

}

package com.steve.stack.linkStack;

/**
 * @Description: 链表结构
 * @Author: SteveTao
 * @Date: 2020/10/1614:51
 **/
public class LinkList {
    private Node first;

    public  LinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertToHead(long d){
        Node newNode = new Node(d);
        newNode.next = first;
        first = newNode;
    }

    public long deleteHead(){
        Node temp = first;
        first = first.next;
        return temp.data;
    }

    public void printItems(){
        Node current = first;
        while (current != null){
            current.printItem();
            current = current.next;
        }
    }

}



//单节点
class Node{
    public long data;
    public Node next;

    public Node(long d){
        data = d;
    }

    public void printItem(){
        System.out.println("data: "+data);
    }
}
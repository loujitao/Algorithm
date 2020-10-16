package com.steve.link.sortedLink;

/**
 *          有序链表
 *  插入数据的时候，找到合适位置插入
 * @Author: SteveTao
 * @Date: 2020/10/1615:49
 **/
public class SortedLinkList {

    private Node head;

    public SortedLinkList(){
        head = null;
    }

    public boolean isEmpty(){
        return  head ==null;
    }

    //升序排列
    public void insert(long key){
        Node newNode = new Node(key);   //构建新节点
        Node previous = null;       //标记
        Node current = head;        //从头开始遍历插入点

        //如果插入的数值，比头节点还小， 则新节点当作头结点，完成操作
        if(current !=null && key < current.data){
            newNode.next = head;
            head = newNode;
            return;
        }

        //如果新增数值比头结点大，向后遍历，找到合适的插入点位
        while (current !=null && key > current.data){
            previous = current;
            current = current.next;
        }

        if (previous == null){
             head = newNode;
        }else {
            previous.next = newNode;
            newNode.next = current;
        }
    }

    //从头开始取数值
    public long deleteFirst(){
        Node temp= head;
        head = head.next;
        return  temp.data;
    }

    public void  printList(){
        System.out.println("sortedLinkList :");
        Node current= head;
        while (current!=null){
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
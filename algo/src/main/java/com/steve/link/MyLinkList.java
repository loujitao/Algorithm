package com.steve.link;

/**
 * @Description:  链表， 只需要知道头结点
 * @Author: SteveTao
 * @Date: 2020/10/1611:27
 **/
public class MyLinkList {

    private MyLink first;  //下一个节点的锚点

    public MyLinkList(){
        first = null;
    }

    //判断链表是否为空
    public boolean isEmpty(){
        return first == null;
    }

    //插入新的节点到链表后面
    //  first --> A aNext
    //  first --> New newNext -->A  aNext
    public void  insertFirst(int i, double d){
        //新建新的节点
        MyLink newLink = new MyLink(i, d);
        //新的节点 -->  旧的链表     newNext-->A
        newLink.next = first;
        //链表头部 -->  新的节点     first-->New
        first = newLink;

    }

    //删除节点      删除前先调用isEmpty()方法检验一下
    // first --> Del DelNext -->A  aNext
    //  first --> A aNext
    public MyLink deleteFirst(){
        // first --> Del
        MyLink temp= first;
        // first --> A aNext
        first = first.next;
        return  temp;
    }

    public void  printList(){
        System.out.println("linkList :");
        MyLink current= first;
        while (current!=null){
            current.prilentItem();
            current = current.next;
        }
    }

}

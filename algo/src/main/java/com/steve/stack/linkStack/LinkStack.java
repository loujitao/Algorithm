package com.steve.stack.linkStack;

/**
 * @Description:  利用链表实现栈
 * @Author: SteveTao
 * @Date: 2020/10/1615:00
 **/
public class LinkStack {

    private LinkList theList;

    public LinkStack(){
        theList = new LinkList();
    }

    public void push(long j){
        theList.insertToHead(j);
    }

    public long pop(){
        return theList.deleteHead();
    }

    public boolean isEmpty(){
        return  theList.isEmpty();
    }

    public void printItem(){
        System.out.println("top --> down");
        theList.printItems();
    }

}

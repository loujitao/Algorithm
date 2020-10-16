package com.steve.link;

/**
 * @Description: 实现 单向链表 数据结构
 *          这是一个单个节点的定义类
 * @Author: SteveTao
 * @Date: 2020/10/1611:18
 **/
public class MyLink {

    public int iData;       //int 类型的数据
    public double dData;    //double 类型的数据
    public MyLink next;     //下一个节点的引用，锚点

    public MyLink(int i,double d){
        iData = i;
        dData = d;
    }

    public void prilentItem(){
        System.out.println("{"+iData+" ,"+dData+"}");
    }
}

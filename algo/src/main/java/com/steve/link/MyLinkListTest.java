package com.steve.link;

/**
 * @Description: TODO
 * @Author: SteveTao
 * @Date: 2020/10/1614:31
 **/
public class MyLinkListTest {

    public static void main(String[] args) {
        MyLinkList list=new MyLinkList();

        list.insertFirst(1,1.111);
        list.insertFirst(2,2.111);
        list.insertFirst(3,3.111);
        list.insertFirst(4,4.111);

        list.printList();

        while (!list.isEmpty()){
            MyLink myLink = list.deleteFirst();
            System.out.println("deleted!");
            myLink.prilentItem();
        }

        list.printList();
    }
}

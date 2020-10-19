package com.steve.link.doubleLink;

/**
 * @Description: 测试
 * @Author: SteveTao
 * @Date: 2020/10/1911:47
 **/
public class DoubleListTest {

    public static void main(String[] args) {
        DoubleLinkList linkList = new DoubleLinkList();
        linkList.insertFirst(1);
        linkList.insertFirst(2);
        linkList.insertFirst(3);
        // 3 -> 2 -> 1
        linkList.insertLast(4);
        linkList.insertLast(5);
        linkList.insertLast(6);
        // 3 -> 2 -> 1 -> 4 -> 5 -> 6
        linkList.printFromHead();

        linkList.insertAfter(1,29);
        linkList.printFromHead();

    }
}

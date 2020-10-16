package com.steve.link.sortedLink;

/**
 * @Description: TODO
 * @Author: SteveTao
 * @Date: 2020/10/1616:05
 **/
public class SortedLinkListTest {

    public static void main(String[] args) {
        SortedLinkList linkList = new SortedLinkList();
        linkList.insert(3);
        linkList.insert(7);
        linkList.insert(1);
        linkList.insert(9);
        linkList.printList();

        linkList.insert(19);
        linkList.insert(2);
        linkList.printList();
    }
}

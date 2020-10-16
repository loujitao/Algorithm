package com.steve.stack.linkStack;

/**
 * @Description: TODO
 * @Author: SteveTao
 * @Date: 2020/10/1615:03
 **/
public class LinkStackTest {

    public static void main(String[] args) {

        LinkStack stack = new LinkStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        while (!stack.isEmpty()){
            long l = stack.pop();
            System.out.println("值： "+l);
        }
    }
}

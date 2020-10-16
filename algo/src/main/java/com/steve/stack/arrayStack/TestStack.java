package com.steve.stack.arrayStack;

/**
 * @Description: 测试类  使用自定义的栈
 * @Author: SteveTao
 * @Date: 2020/10/1516:02
 *
 *  栈： 先进后出
 **/
public class TestStack {

    public static void main(String[] args) {
        StackApp stack=new StackApp(6);
        int i=1;
        while (!stack.isFull()){
            stack.push(10*i);
            i++;
        }
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);

        while ( ! stack.isEmpty()){
            long v=stack.pop();
            System.out.println("数值: "+v);
        }

    }

}

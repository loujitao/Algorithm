package com.steve.stack.arrayStack;

/**
 * @Description: 利用数组实现 栈 这种数据结构
 * @Author: SteveTao
 * @Date: 2020/10/1515:48
 **/
public class StackApp {

    private int maxSize;    //栈最大深度
    private long[] stackArray;
    private int top;        //栈顶下标

    public StackApp(int size){
        maxSize = size;     //设置深度
        stackArray=new long[maxSize]; //初始化栈
        top = -1;  //初始化值，无数据栈为空数组，无下标
    }

    //压栈方法， 从栈顶加入
    public void push(long j){
        if(top==maxSize-1) {
            throw new RuntimeException("栈满");
        }
        stackArray[++top] = j;//添加数据，修改栈顶下标
    }

    //出栈
    public long pop(){
        if(top==0) {
            throw new RuntimeException("空栈");
        }
        return stackArray[top--];
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return  (top == -1);
    }

    //判断栈是否满了
    public boolean isFull(){
        return (top == maxSize-1);
    }

}

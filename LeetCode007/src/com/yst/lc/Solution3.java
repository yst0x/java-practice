package com.yst.lc;

//150.逆波兰表达式求值
//遇到操作数就存到数组里面，遇到运算符就取出两个操作
//注意先取出来的是右操作数，后取出来的是左操作数
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for(String c : tokens){
            if("+".equals(c) || "-".equals(c) || "*".equals(c) || "/".equals(c)){
                int b=stack.pop();
                int a=stack.pop();
                switch(c){
                    case "+": stack.push(a+b); break;
                    case "-": stack.push(a-b); break;
                    case "*": stack.push(a*b); break;
                    case "/": stack.push(a/b); break;
                }
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}

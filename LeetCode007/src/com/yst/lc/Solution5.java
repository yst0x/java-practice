package com.yst.lc;

//20.有效的括号
//遇到括号的一边就把另一边塞进去，如果不是就弹出来，不相等就是错误的
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution5 {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
            else if(c=='['){
                stack.push(']');
            }
            else if(c=='{'){
                stack.push('}');
            }
            else{
                if(stack.isEmpty() || stack.pop()!=c){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

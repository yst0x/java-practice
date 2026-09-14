package com.yst.lc;

//1049.删除字符串中所以相邻的重复项
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution4 {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.reverse().toString();
    }
}

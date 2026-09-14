package com.yst.lc;

//1249.移除无效括号
//通过栈的方法，遍历数组把无效括号的下标标记，再次遍历，只取没有标记的下标对应的内容
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution1 {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque();
        int[] news = new int[s.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='(' && c!=')'){
                continue;
            }
            else if(c == '('){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){
                    news[i]=-1;
                }
                else{
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            int index=stack.pop();
            news[index]=-1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(news[i]!=-1){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}

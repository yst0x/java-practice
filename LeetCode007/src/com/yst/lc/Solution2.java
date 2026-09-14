package com.yst.lc;

//739.每日温度
//answer的数组里面记录temperatures的下标，一旦遇到比自己大的，就把下标取出来，相减，得到相差的长度
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution2 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer=new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int prevIndex=stack.pop();
                answer[prevIndex]=i-prevIndex;
            }
            stack.push(i);
        }
        return answer;
    }
}

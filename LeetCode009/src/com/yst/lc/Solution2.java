package com.yst.lc;

//3.无重复字符的最长子串
import java.util.Arrays;

public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLen=0;
        int[] lastIndex=new int[128];
        Arrays.fill(lastIndex,-1);
        for(right=0;right<s.length();right++){
            char c=s.charAt(right);
            if(lastIndex[c]>=left){
                left=lastIndex[c]+1;
            }
            lastIndex[c]=right;
            maxLen=maxLen<(right-left+1)?right-left+1:maxLen;
        }
        return maxLen;
    }
}

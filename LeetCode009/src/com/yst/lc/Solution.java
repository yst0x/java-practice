package com.yst.lc;

//125.验证回文串
public class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left < right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char c1=Character.toLowerCase(s.charAt(left));
            char c2=Character.toLowerCase(s.charAt(right));
            if(c1!=c2){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

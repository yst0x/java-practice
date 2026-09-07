package com.yst.lc;

public class Solution2 {
    public int removeElement(int[] nums, int val){
        int k=0;
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]==val){
                for(int j=i;j<len-1;j++){
                    nums[j]=nums[j+1];
                }
                len--;
                i--;
            }
            else{
                k++;
            }
        }
        return k;
    }
}

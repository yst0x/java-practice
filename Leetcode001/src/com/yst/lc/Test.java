package com.yst.lc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target = 9;
        Sum s = new Sum();
        int[] res = s.twoSum(arr,target);
        System.out.println(Arrays.toString(res));
    }
}


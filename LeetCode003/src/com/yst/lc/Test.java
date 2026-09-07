package com.yst.lc;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例1：常规场景
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        int k1 = solution.removeElement(nums1, val1);
        System.out.println("测试用例1结果：k=" + k1 + "，前k个元素：" + Arrays.toString(Arrays.copyOf(nums1, k1)));

        // 测试用例2：最后一位是待删除元素（之前容易死循环的场景）
        int[] nums2 = {1,2,3};
        int val2 = 3;
        int k2 = solution.removeElement(nums2, val2);
        System.out.println("测试用例2结果：k=" + k2 + "，前k个元素：" + Arrays.toString(Arrays.copyOf(nums2, k2)));

        // 测试用例3：全数组都是待删除元素
        int[] nums3 = {2,2,2};
        int val3 = 2;
        int k3 = solution.removeElement(nums3, val3);
        System.out.println("测试用例3结果：k=" + k3 + "，前k个元素：" + Arrays.toString(Arrays.copyOf(nums3, k3)));

        // 测试用例4：没有任何待删除元素
        int[] nums4 = {1,2,3,4};
        int val4 = 5;
        int k4 = solution.removeElement(nums4, val4);
        System.out.println("测试用例4结果：k=" + k4 + "，前k个元素：" + Arrays.toString(Arrays.copyOf(nums4, k4)));

    }
}

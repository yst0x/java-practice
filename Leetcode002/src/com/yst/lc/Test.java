package com.yst.lc;

public class Test {
    public static void main(String[] args) {
        // 先创建Solution的实例
        Solution2 solution = new Solution2();

        // 测试示例1：anagram 和 nagaram 预期输出true
        String s1 = "anagram";
        String t1 = "nagaram";
        boolean result1 = solution.isAnagram(s1, t1);
        System.out.println("示例1测试结果：" + result1);

        // 测试示例2：rat 和 car 预期输出false
        String s2 = "rat";
        String t2 = "car";
        boolean result2 = solution.isAnagram(s2, t2);
        System.out.println("示例2测试结果：" + result2);

        // 额外加一个边界测试：空字符串 预期输出true
        String s3 = "";
        String t3 = "";
        boolean result3 = solution.isAnagram(s3, t3);
        System.out.println("空字符串测试结果：" + result3);

        // 额外加一个长度不等测试：a 和 ab 预期输出false
        String s4 = "a";
        String t4 = "ab";
        boolean result4 = solution.isAnagram(s4, t4);
        System.out.println("长度不等测试结果：" + result4);
    }
}

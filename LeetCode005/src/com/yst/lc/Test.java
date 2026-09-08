package com.yst.lc;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例1：题目示例1，pos=1的环形链表
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // 尾部连回索引1的节点
        ListNode result1 = solution.detectCycle(node1);
        System.out.println("用例1结果：" + (result1 != null ? result1.val : "无环") + "，预期值：2");

        // 测试用例2：单节点自环边界场景
        ListNode singleNode = new ListNode(1);
        singleNode.next = singleNode;
        ListNode result2 = solution.detectCycle(singleNode);
        System.out.println("用例2结果：" + (result2 != null ? result2.val : "无环") + "，预期值：1");

        // 测试用例3：无环的普通链表
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        a1.next = a2;
        a2.next = a3;
        ListNode result3 = solution.detectCycle(a1);
        System.out.println("用例3结果：" + (result3 != null ? result3.val : "无环") + "，预期值：无环");

        // 测试用例4：空链表边界场景
        ListNode result4 = solution.detectCycle(null);
        System.out.println("用例4结果：" + (result4 != null ? result4.val : "无环") + "，预期值：无环");
    }
}

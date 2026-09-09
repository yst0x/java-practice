package com.yst.lc;

public class Test {
    // 辅助工具：把数组快速构建成链表
    public static ListNode buildList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int num : arr) {
            cur.next = new ListNode(num);
            cur = cur.next;
        }
        return dummy.next;
    }

    // 辅助工具：打印链表，方便看结果
    public static void printList(ListNode head) {
        System.out.print("[");
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) {
                System.out.print(", ");
            }
            cur = cur.next;
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 测试用例1：题目示例1
        System.out.print("测试用例1 输入 [1,2,3,4,5] n=2 输出：");
        ListNode list1 = buildList(new int[]{1,2,3,4,5});
        printList(solution.removeNthFromEnd(list1, 2));

        // 测试用例2：题目示例2 删唯一头结点
        System.out.print("测试用例2 输入 [1] n=1 输出：");
        ListNode list2 = buildList(new int[]{1});
        printList(solution.removeNthFromEnd(list2, 1));

        // 测试用例3：删除头结点场景
        System.out.print("测试用例3 输入 [1,2] n=2 输出：");
        ListNode list3 = buildList(new int[]{1,2});
        printList(solution.removeNthFromEnd(list3, 2));

        // 测试用例4：删除尾结点场景
        System.out.print("测试用例4 输入 [1,2,3] n=1 输出：");
        ListNode list4 = buildList(new int[]{1,2,3});
        printList(solution.removeNthFromEnd(list4, 1));
    }
}

package com.yst.lc;

public class Test2 {
    public static void main(String[] args) {
        // 构造测试链表 1->2->3->4->5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("反转前的链表：");
        printList(head);

        // 调用反转方法
        Solution2 reverseSolution = new Solution2();
        ListNode reversedHead = reverseSolution.reverseList(head);

        System.out.println("反转后的链表：");
        printList(reversedHead);
    }

    // 通用链表打印工具方法
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
}

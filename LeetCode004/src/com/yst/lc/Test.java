package com.yst.lc;

public class Test {
    // 辅助方法：把数组快速转换成链表，方便构造测试用例
    public static ListNode arrayToList(int[] arr) {
        if(arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for(int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // 辅助方法：把链表打印成方便看的字符串格式
    public static void printList(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.val);
            if(curr.next != null) System.out.print(" → ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 直接用题目给的示例测试
        int[] testArr = {1,2,6,3,4,5,6};
        int targetVal = 6;
        ListNode testHead = arrayToList(testArr);

        System.out.println("删除前的链表：");
        printList(testHead);

        ListNode resultHead = solution.removeElements(testHead, targetVal);

        System.out.println("删除值为" + targetVal + "后的链表：");
        printList(resultHead);
    }
}

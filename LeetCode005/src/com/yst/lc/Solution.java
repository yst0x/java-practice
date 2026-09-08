package com.yst.lc;

public class Solution {
    public ListNode detectCycle(ListNode head){
        //慢指针
        ListNode slow = head;
        //快指针
        ListNode fast = head;
        while(fast != null && fast.next != null){
            //慢指针每次走1步
            slow = slow.next;
            //快指针每次走2步
            fast = fast.next.next;
            if(slow == fast){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
                return fast;
            }
        }
        return null;
    }
}

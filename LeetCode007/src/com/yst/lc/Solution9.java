package com.yst.lc;

//61.旋转链表
public class Solution9 {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k == 0){
            return head;
        }
        int count = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            count++;
        }
        int m=k%count;
        if(m==0){
            return head;
        }
        else{
            tail.next = head;
            int move=count-m;
            for(int i=0;i<move;i++){
                tail = tail.next;
            }
            ListNode newhead = tail.next;
            tail.next = null;
            return newhead;
        }
    }
}

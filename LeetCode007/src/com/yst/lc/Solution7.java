package com.yst.lc;

//25.k个一组翻转链表
//首先要先计算原链表的个数，把链表分组，逐组翻转
public class Solution7 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tail=head;
        int count=1;
        while(tail.next!=null){
            count++;
            tail = tail.next;
        }
        ListNode s = new ListNode(0);
        ListNode cur = s;
        ListNode slow=head;
        ListNode fast=null;
        ListNode prev=null;
        int n= count/k;
        for(int i=0;i<n;i++){
            fast=slow;
            for(int j=0;j<k;j++){
                ListNode temp=fast.next;
                fast.next=prev;
                prev=fast;
                fast=temp;
            }
            cur.next=prev;
            slow.next=fast;
            cur=slow;
            slow=fast;
        }
        return s.next;
    }
}

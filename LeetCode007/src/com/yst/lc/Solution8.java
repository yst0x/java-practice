package com.yst.lc;

//86.分隔链表
//这道题要先创建两个链表，分别接收比x大的值，和比x小的值，然后再把这两个链表连起来
public class Solution8 {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode pa=head;
        ListNode pb=small;
        ListNode pc=large;
        while(pa!=null){
            if(pa.val<x){
                pb.next=pa;
                pb=pb.next;
            }
            else{
                pc.next=pa;
                pc=pc.next;
            }
            pa=pa.next;
        }
        pc.next=null;
        pb.next=large.next;
        ListNode newhead = small.next;
        return newhead;
    }
}

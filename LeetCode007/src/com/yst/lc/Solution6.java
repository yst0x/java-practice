package com.yst.lc;

//21.合并两个有序链表
public class Solution6 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode list3=dummy;
        ListNode p1=list1;
        ListNode p2=list2;
        while(p1!=null && p2!=null){
            if(p1.val <= p2.val){
                list3.next=p1;
                p1=p1.next;
            }
            else{
                list3.next=p2;
                p2=p2.next;
            }
            list3=list3.next;
        }
        list3.next=(p1!=null)?p1:p2;
        return dummy.next;
    }
}

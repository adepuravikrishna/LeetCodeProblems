package com.ravikrishna.adepu.linkedlists;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class FindIntersectionOfLinkedList {

	public static void main(String[] args) {
		ListNode headA = new ListNode(1);
		headA.next = new ListNode(3);;
		headA.next.next = new ListNode(5);
        ListNode headB = new ListNode(2);
        headB.next = headA.next ;
        
        while(headB != null) {
        	System.out.println(" "+ headB.val);
        	headB = headB.next;
        	
        }
	}

}

package com.lams1989.printreverselinkedlist;

import java.util.Stack;

public class AppPrintReverseLinkedList {
	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 530, 474 };
		

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		reversePrint(llist.head);
	
	}

	static void reversePrint(SinglyLinkedListNode head) {

		SinglyLinkedListNode temp = head;
	    Stack<Integer> aux = new Stack<Integer>();
	    while(temp != null){
	        aux.push(temp.data);
	        temp = temp.next;
	    }
	    while(!aux.empty()){
	        System.out.println(aux.pop());
	    }
		

	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		if (head == null) {
			return nodeInsert;
		}
		nodeInsert.next = head;
		return nodeInsert;
	}

	static void printLinkedList(SinglyLinkedListNode head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}

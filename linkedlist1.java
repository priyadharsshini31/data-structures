package com.cisco.test;

public class LinkedList {
	Node head;

	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList() {
		this.head = null;
	}


	public void add(int data) {
		Node ptr = null;
		if(head == null) {
			head = new Node(data,null);
		}else {
			ptr = head;
			while(ptr.getNext() != null) {
				ptr = ptr.getNext();
			}
			ptr.setNext(new Node(data, null));
		}
	}

	public void remove(int data) {
		Node ptr = null;
		Node prev = null;
		if(head == null)
			return;
		else if(head.getData() == data) {
			head = null;
		}else {
			ptr = head;
			prev = ptr;
			while(ptr.getData() != data && ptr.getNext()!= null) {
				prev = ptr;
				ptr = ptr.getNext();
			}
			prev.setNext(ptr.getNext());
		}
	}

	public void display() {
		Node ptr = head;
		while(ptr != null) {
			System.out.print(ptr.data+" ");
			ptr = ptr.next;
		}
		System.out.println();
	}
	class Node{
		int data;
		Node next;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}
}

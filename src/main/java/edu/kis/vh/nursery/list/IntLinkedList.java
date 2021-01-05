package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private Node last;
	int i;
	private final int ERRORVALUE=-1;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return ERRORVALUE;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return ERRORVALUE;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}

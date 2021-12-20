package main;

import java.util.Iterator;

public class SinglyLinkedList implements Iterable<Car> {

	public Node head;
	public int size;

	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void addFromFirst(Car c) {
		if (c == null)
			return;
		Node n = new Node(c);
		if (head == null) {
			head = n;
			System.out.println("h: " + head.data);
			size++;
			return;
		}
		n.next = head;
		head = n;
		size++;
	}

	public void addFromLast(Car c) {
		if (c == null)
			return;

		if (head == null) {
			addFromFirst(c);
			return;
		}
		Node current = head;
		Node n = new Node(c);
		while (current.next != null) {
			current = current.next;
		}
		current.next = n;
		size++;

	}

	public Car get(int index) {
		if (index > size)
			return null;
		Node current = head;
		int i = 0;
		while (current.next != null) {
			if (i == index) {
				return current.data;
			}
			current = current.next;
			i++;
		}
		return null;
	}

	public void insert(Car c, int index) {
		if (c == null || index > size)
			return;

		Node n = new Node(c);
		Node current = head;

		if (index == 0) {
			addFromFirst(c);
			return;
		}
		int i = 0;
		while (current.next != null) {
			if (i == index - 1) {
				n.next = current.next;
				current.next = n;
				size++;
			}
			current = current.next;
			i++;
		}
	}

	public void remove(int index) {
		if (index > size)
			return;

		if (index == 0) {
			head = null;
			size--;
			return;
		}
		int i = 0;
		Node current = head;
		while (current.next != null) {
			if (i == index - 1) {
				current.next = current.next.next;
				size--;
			}
			current = current.next;
			i++;
		}
	}

	@Override
	public Iterator<Car> iterator() {
		return new IterableCar();
	}

	class IterableCar implements Iterator<Car> {
		public int position;

		@Override
		public boolean hasNext() {
			return position < size;
		}

		@Override
		public Car next() {
			return get(position++);
		}

	}

	@Override
	public String toString() {
		String s = "{";
		Node current = head;
		while (current != null) {
			s += current.data + "-> ";
			current = current.next;
		}
		return s + "}";
	}

}

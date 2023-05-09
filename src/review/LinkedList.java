package review;

public class LinkedList {
	/**
	 * Create linkedList 1) delete at position 2) Print LinkedList
	 */
	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

	}

	public static Node head;

	/**
	 * To add node to the list.
	 * 
	 * @param data- data to be inserted.
	 * @return
	 */
	public Node add(int data) {
		/*
		 * New node is created.
		 */
		Node newNode = new Node(data);
		/*
		 * Checking if the list is empty If it is empty then the new node will become
		 * the head of the list.
		 */
		if (head == null) {
			head = newNode;
			/*
			 * If list is not empty then we are assigning head of the list to node temp.
			 */
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = newNode;
		}
		return head;

	}

	public boolean search(int key) {
		Node current = head;
		if (current != null) {
			if (current.data = key) {
				return true;

			}
		}
		return false;

	}

	public void deleteAt(int pos, int data) {
		Node newNode = new Node(data);
		if (pos == 0) {
			newNode.next = head;
			head = newNode;
		} else {
			Node temp = head;

			if (pos > 0) {
				if (temp != null) {
					for (int i = 0; i <= pos - 1; i++) {

					}

				}

			}

		}

	}

	/**
	 * To print the list.
	 */
	public static void printLinkedList() {
		if (head == null) {
			System.out.print("LinkedList is empty");
		}

		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

	}

}

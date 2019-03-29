package com.bridgelabs.functionalutil;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SinglyLinkedList<T> {
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	private String key;

	public boolean isEmpty() {
		return head == null;
	}

	public String addElement(T element) {
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		size++;
		System.out.println(element);

		/**
		 * check if the list is empty
		 */
		if (isEmpty()) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
		}
		return null;
	}

	public void deleteAfter(T key) {

		Node<T> tmp = head;
		Node<T> refNode = null;
		System.out.println("Traversing to all nodes..");
		/**
		 * Traverse till given element
		 */
		while (true) {
			if (tmp == null) {
				break;
			}
			if (tmp.compareTo(key) == 0) {
				// found the target node, add after this node
				refNode = tmp;
				break;
			}
			tmp = tmp.getNextRef();
		}
		if (refNode != null) {
			tmp = refNode.getNextRef();
			refNode.setNextRef(tmp.getNextRef());
			if (refNode.getNextRef() == null) {
				tail = refNode;
			}
			System.out.println("Deleted: " + tmp.getValue());
		} else {
			System.out.println("Unable to find the given element...");
		}
	}

	public void delete(String key) {

	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}

	}

	public void remove(T item) {
		Node<T> n = head;
		Node<T> prev = null;
		if (head.key.equals(item)) {
			head = head.getNextRef();
			size -= 1;
			return;
		}
		while (!n.key.equals(item)) {
			prev = n;
			n = n.getNextRef();
		}
		n = n.getNextRef();
		prev.setNextRef(prev.getNextRef());
		n = null;
		size -= 1;
	}

	public boolean searchKey(SinglyLinkedList<String> list, String key) {
		Node current = head;
		boolean status = false;
		while (current != null) {
			for (int i = 0; i < list.size; i++) {
				if (list.equals(key)) {
					System.out.println("Element is present in the list ");
					//status = true;
					break;
				} else
				{
					current = current.getNextRef();
			}
			
		}
			System.out.println("Element is not present in the list ");
		return false;
	}
		return status;

	}
}

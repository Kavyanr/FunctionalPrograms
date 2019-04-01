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
	static String[] str = new String[100];
	static SinglyLinkedList newList = new SinglyLinkedList();

	public boolean isEmpty() {
		return head == null;
	}

	public String addElement(String key) {
		Node<T> nd = new Node<T>();
		nd.setValue(key);
		size++;

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

	public void get() {

		Node<T> tmp = head;
		int k = 0;
		while (true) {
			if (tmp == null) {
				break;
			}
			str[k] = String.valueOf(tmp.getValue());
			k++;
			tmp = tmp.getNextRef();
		}
	}

	public SinglyLinkedList<T> searchKey(SinglyLinkedList<T> list, String key) {
		Node current = head;
		boolean status = false;
		for (int i = 0; i < str.length - 1; i++) {
			if (str[i] != null && str[i].equals(key)) {
				status = true;
				str[i] = null;
				current = current.getNextRef();
				break;
			}
		}
		for (int i = 0; i < str.length; i++) {
			if (str[i] != null)
				newList.addElement(str[i]);
		}
		if (status) {
			System.out.println("Element is present in the list ");
		} else {
			System.out.println("Element is not present in the list ");
			newList.addElement(key);
		}

		return newList;
	}
	
	public SinglyLinkedList<T> bubble(SinglyLinkedList<T> list,int size) {
		Node next,currentNode;
		
		if (size > 1) {
            for (int i = 0; i < size; i++ ) {
                 currentNode = head;
                 next = head.getNextRef();
                for (int j = 0; j < size - 1; j++) {
                    if (currentNode.getValue().compareTo(next.getValue())>0) {
                        Node temp = currentNode;
                        currentNode = next;
                        next = temp;
                    } 
                    currentNode = next;
                    next = next.getNextRef();                   
                } 
            
            }}
		}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	}

	
	






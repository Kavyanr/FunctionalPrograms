package com.bridgelabs.functionalutil;

public class Node<T> implements Comparable<T> {
	      
		private String value;
	    private Node<T> nextRef;
		public String key;   
		
		
	    public String getValue() {
	        return value;
	    }
	    public void setValue(String key2) {
	        this.value = key2;
	    }
	    public Node<T> getNextRef() {
	        return nextRef;
	    }
	    public void setNextRef(Node<T> ref) {
	        this.nextRef = ref;
	    }
	    public Node<T> getSize()
	    { 
	    	return this.getSize();
	    }
	    public void setSize(Node<T> size) {
	        this.nextRef = size;
	    }
		@Override
		public int compareTo(T o) {
			// TODO Auto-generated method stub
			return 0;
		}
		
		
}

package singlyLinkedList;

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> implements List<E>{
	private Node<E> head;
	private Node<E> tail;
	private int size;
	
	public SinglyLinkedList() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}

	private Node<E> search(int index){
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException();
		Node<E> x=head;
		
		for(int i=0; i<index; i++) {
			x=x.next;
		}
		
		return x;
	}
	
	public void addFirst(E value) {
		Node<E> newNode=new Node<E>(value);
		newNode.next=head;
		head=newNode;
		size++;
		
		if(head.next==null)
			tail=head;
	}
	
	@Override
	public boolean add(E value) {
		addLast(value);
		return true;
	}
	
	public void addLast(E value) {
		Node<E> newNode=new Node<E>(value);
		
		if(size==0) {
			addFirst(value);
			return;
		}
		
		tail.next=newNode;
		tail=newNode;
		size++;
	}
	
	@Override
	public void add(int index, E value) {
		if(index>size || index<0) {
			throw new IndexOutOfBoundsException();
		}
		
		if(index==0) {
			addFirst(value);
			return;
		}
		
		if(index==size) {
			addLast(value);
			return;
		}
		
		Node<E> prevNode=search(index-1);
		Node<E> nextNode=prevNode.next;
		Node<E> newNode=new Node<E>(value);
		
		prevNode.next=null;
		prevNode.next=newNode;
		newNode.next=nextNode;
		size++;
	}
	
	
	public E remove() {
		Node<E> headNode=head;
		
		if(headNode==null)
			throw new NoSuchElementException();
		
		E element=headNode.data;
		Node<E> nextNode=head.next;
		
		head.data=null;
		head.next=null;
		
		head=nextNode;
		size--;
		
		if(size==0)
			tail=null;
		
		return element;
	}
	
	@Override
	public E remove(int index) {
		if(index==0)
			return remove();
		
		if(index>=size || index<0)
			throw new IndexOutOfBoundsException();
		
		Node<E> prevNode=search(index-1);
		Node<E> removedNode=prevNode.next;
		Node<E> nextNode=removedNode.next;
		
		E element=removedNode.data;
		
		prevNode.next=nextNode;
		
		removedNode.next=null;
		removedNode.data=null;
		size--;
		
		return element;
	}
	
	@Override
	public boolean remove(Object value) {
		Node<E> prevNode=head;
		boolean hasValue=false;
		Node<E> x=head;//removedNode
		
//		for(;x!=null;x=x.next) {
//			if(value.equals(x.data)) {
//				hasValue=true;
//				break;
//			}
//			prevNode=x;
//		}
		
		while(x!=null) {
			if(value.equals(x.data)) {
				hasValue=true;
				break;
			}
			prevNode=x;
			x=x.next;
		}
		
		if(x==null)
			return false;
		
		if(x.equals(head)) {
			remove();
			return true;
		} else {
			prevNode.next=x.next;
			
			x.data=null;
			x.next=null;
			size--;
			
			return true;
		}
	}
	
	@Override
	public E get(int index) {
		return search(index).data;
	}
	
	@Override
	public void set(int index, E value) {
		Node<E> replaceNode=search(index);
		replaceNode.data=null;
		replaceNode.data=value;
	}
	
	@Override
	public int indexOf(Object value) {
		int index=0;
		
		for(Node<E> x=head; x!=null; x=x.next) {
			if(value.equals(x.data))
				return index;
			index++;
		}
		return -1;
	}
	
	@Override
	public boolean contains(Object item) {
		return indexOf(item)>=0;
	}
	
	@Override
	public int size() {
		return size;
	}
	
	@Override
	public boolean isEmpty() {
		return size==0;
	}
	
	@Override
	public void clear() {
		for(Node<E> x=head; x!=null;) {
			Node<E> nextNode=x.next;
			x.data=null;
			x.next=null;
			x=nextNode;
		}
		head=tail=null;
		size=0;
	}
	
	
}

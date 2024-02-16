public class LinkedList implements List
{
	private ListNode head;
	private ListNode tail;

	public LinkedList()
	{ 
		makeEmpty(); 
	}
	
	public void makeEmpty()
	{
		head = tail = new ListNode(); 
	}
	public boolean isEmpty()
	{
		return (head == tail);
	}
	
	public Object getFirst()
	{
		if (isEmpty())
			throw new EmptyLinkedListException();
		return head.getNext().getElement(); 
	}
	public Object getLast()
	{
		if (isEmpty())
			throw new EmptyLinkedListException();
		return tail.getElement(); 
	}
	
	public void addFirst(Object e)
	{
		head.setElement(e);
		ListNode n = new ListNode();
		n.setNext(head);
		head = n;
	}
	public void addLast(Object e)
	{
		tail.setNext(new ListNode(e, null));
		tail = tail.getNext();
	}
	public Object removeFirst()
	{
		Object e = getFirst();
		head = head.getNext();
		head.setElement(null);
		return e;
	}
	public Object removeLast()
	{
		Object e = getLast();
		ListNode temp = head;
		while (temp.getNext() != tail)
			temp = temp.getNext();
		tail = temp;
		tail.setNext(null);
		return e;
	}
	
	public ListIterator getIterator()
	{
		return new LinkedListIterator(head);
	}
	private class LinkedListIterator implements ListIterator
	{
		public LinkedListIterator(ListNode h)
		{
			current = h;
			previous = null;
		}
		public boolean hasNext()
		{
			return (current.getNext() != null); 
		}
		public Object next()
		{
			if (!hasNext())
				throw new IllegalStateException();
			previous = current;
			current = current.getNext();
			return current.getElement();
		}
		public void add(Object obj)
		{
			ListNode a = new ListNode(obj,current.getNext());
			current.setNext(a);
			previous = current;   
            current = current.getNext();
            if (!hasNext())   
                LinkedList.this.tail = current;
		}
		public void remove() throws IllegalStateException
		{
			if (previous == null) 
				throw new IllegalStateException();
            previous.setNext(current.getNext());
            current = previous;
            previous = null;
            if (!hasNext())    
                LinkedList.this.tail = current; 
		}
		private ListNode current;
		private ListNode previous;
	}

	public static void main(String[] args)
	{  
		LinkedList list = new LinkedList();
		list.addFirst("A");
		list.addLast("B");
		list.addFirst("C");
		ListIterator iter = list.getIterator();
		iter.next();
		iter.add("I");
		while (iter.hasNext())
			iter.next();
		iter.remove();
		list.addLast("O");
		iter = list.getIterator();
		while (iter.hasNext())
			System.out.print(iter.next());
	}
}
package eg.edu.alexu.csd.datastructure.linkedList.cs76_cs88;

public class SingleLinked implements ILinkedList  {
	private int length ;
	private Node head = new Node(null);
	public class Node{
		private Object element ;
		private Node next;
		Node(Object e){
			element = e;
			next= null ;
		}
	}
	public SingleLinked(){
	this.length=0;
	
	}
	
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		Node newNode = new Node(element);
		if (index==length) {
			this.add(element);
		}
		else if(index==0) {
			if(length==0) {
				head= newNode;
				newNode.next=null;
			}
			else {
				newNode.next=head;
				head=newNode;
			}
			length++;
		}
		else {
			Node temp =head;
			for(int i=0; i < index-1 && temp.next != null; i++){
				temp=temp.next;
			}
			Node end = temp.next;
			temp.next=newNode;
			newNode.next=end;
		length++;
		}
	}

	public void add(Object element) {
		// TODO Auto-generated method stub
	
		Node newNode =new Node(element);
		if (head==null) {
			
			head=newNode;
		}
		else {
	     newNode = head;
		while(newNode.next != null)
		{
			newNode = newNode.next;
		}
		
		newNode.next = new Node(element);}
		length++;
		}

	public Object get(int index) {
		// TODO Auto-generated method stub
		Node temp=head;
		for(int i=0; i<index; i++)
		{
			temp = temp.next;
		}
		return temp;
	}

	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		Node temp=head;
		for(int i=0; i<index; i++)
		{
			temp = temp.next;
		}
		System.out.println(temp.element);
		temp.element=element;
	}

	public void clear() {
		// TODO Auto-generated method stub
		head=null;
		length=0;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return length==0;
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		
		if(length==0) {
			System.out.println("the list is empty");
		}
		else if(length==1) {
			head=null;
			length--;
		}
		else {
		if(index==0) {
			head=head.next;
		}
		else {
		Node temp =head;
		for(int i=0; i < index-1 && temp.next != null; i++){
			temp=temp.next;
		}
		Node end = temp.next;
		temp.next=end.next;}
        length--;
	}}

	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	public ILinkedList sublist(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		SingleLinked  sub = new SingleLinked();
	    Node temp = head;
	    int c=0;
	    while(temp!=null){
	         if(c>fromIndex && c<toIndex){
	              sub.add(temp.element);
	         }
	         temp=temp.next;
	         c++;
	    }
	    return sub;
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		 Node cursor = head;
		 
		 	    while(cursor != null)
		 
		 	    {    if(cursor.element == o)
		 
		 	                  {return true;}
		 
		 	               cursor = cursor.next;}
		 		 	            
		 
		 	    return false;   
	}
	
	
	
	public void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.element);
			temp = temp.next;
		}
	}
}


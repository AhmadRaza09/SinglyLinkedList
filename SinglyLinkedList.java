/**
	Created By: Ahmad Raza
	Date: 15 Mar 2022

**/

public class SinglyLinkedList
{
	private Node head;  //store the reference of the first node in the chain
	private Node tail;  //store the reference of the first node in the chain
	private Node current;  //store the reference of the current node in the chain
	
	/** store the reference of the previous node with respect to the current
	node in the chain if there is only one node in the chain then store the reference of the current node**/
	private Node lastCurrentNode;
	private int size;  //store the size of the chain
	
	
	public SinglyLinkedList()
	{
		
		head = null;
		tail = null;
		current = null;
		lastCurrentNode = null;
		size = 0;
	}
	
	//return the size of the chain
	public int getSize()
	{
		
		return size;
	}
	
	
	//add the node in the chain after the current node
	public void add(int addValue)
	{
		Node newNode = new Node();
		newNode.setValue(addValue);
		
		//check is chain contain node
		if(current != null)
		{
			//check is current node is the last node
			if(current.getNext() == null)
			{
				tail = newNode;  //if current node is last node then tail store reference of the newnode
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
			lastCurrentNode = current;
			current = newNode;
			
		}
		else
		{
			current = newNode;
			lastCurrentNode = current;
			head = newNode;
			tail = newNode;
			newNode.setNext(null);
		}
		
		size = size + 1;
		
	}
	
	public void update(int updateValue)
	{
		if(current != null)
		{
			current.setValue(updateValue);
		}
	}
	
	
	//remove all the node from the chain
	public void clear()
	{
		head = null;
		tail = null;
		current = null;
		lastCurrentNode = null;
		size = 0;
	}
	
	//get the value where current node piont, if current node is null then throws ListEmptyException
	public int get() throws ListEmptyException
	{
		if(current != null)
		{
			return current.getValue();
		}
		
		throw new ListEmptyException("List is empty");
		
	}
	
	
	
	//traversing list operation
	
	//move the current reference to the next node in the chain
	public boolean next()
	{
		
		
		if(head != null)
		{
			//if current is connected to the next node then return true
			if(current.getNext() != null)
			{
				lastCurrentNode = current;
				current = current.getNext();
				return true;
			}
		}
	
		//if current is not connected to the next node then return false
		return false;
	}
	
	
	//piont the current to the head
	public void start()
	{
		current = head;
		lastCurrentNode = head;
	}
	
	
	
}
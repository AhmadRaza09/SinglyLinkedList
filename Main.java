public class Main
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		
		SinglyLinkedList l1 = new SinglyLinkedList();
		
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.find(5);
		System.out.println(l1.get());
		System.out.println(l1.lastCurrentNode.getValue());
	}
}
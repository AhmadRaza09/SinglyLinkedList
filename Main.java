public class Main
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		
		SinglyLinkedList l1 = new SinglyLinkedList();
		
		l1.add(3);
		
		l1.back();
		System.out.println(l1.get());
		System.out.println(l1.lastCurrentNode.getValue());
	}
}
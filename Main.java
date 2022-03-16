public class Main
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		
		SinglyLinkedList l1 = new SinglyLinkedList();
		
		l1.add(3);
		System.out.println(l1.get());
		l1.update(100);
		System.out.println(l1.get());
	}
}
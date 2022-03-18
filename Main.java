public class Main
{
	
	public static void main(String [] args) throws ListEmptyException
	{
		
		SinglyLinkedList l1 = new SinglyLinkedList();
		
		for(int i = 0; i < 10; i++)
		{
			l1.add(i);
		}
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			int size = l1.getSize();
			System.out.print(l1.get());
			if(i < size)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		System.out.println("From start");
		
		
		l1.start();
		l1.next();
		l1.next();
		l1.next();
		l1.remove();
		l1.remove();
		l1.remove();
		l1.remove();
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			int size = l1.getSize();
			System.out.print(l1.get());
			if(i < size)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		System.out.println("From tail");
		
		l1.tail();
		l1.remove();
		l1.remove();
		l1.remove();
		l1.remove();
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			int size = l1.getSize();
			System.out.print(l1.get());
			if(i < size)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		System.out.println("From start node");
		
		
		l1.start();
		l1.remove();
		l1.remove();
		l1.remove();
		l1.start();
		for(int i = 1; i <= l1.getSize(); i++)
		{
			int size = l1.getSize();
			System.out.print(l1.get());
			if(i < size)
			{
				System.out.print("->");
			}
			l1.next();
		}
		System.out.println();
		
		
	}
}
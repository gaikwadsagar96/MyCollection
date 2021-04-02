package Practice;

public class MyLinkedList 
{
	Node head;
	void add(int data)
	{
		if(head==null)
		{
			head=new Node(data);
		}
		else
		{
			Node p=head;
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=new Node(data);
		}
	}
	public void print() 
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
		
	}
}

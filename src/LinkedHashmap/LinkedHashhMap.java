package LinkedHashmap;

public class LinkedHashhMap 
{
	Node []a=new Node[5];
	Node head;
	String get(int key)
	{
		int index=key%a.length;
		Node p=a[index];
		while(p!=null)
		{
			if(p.key==key)
				return p.value;;
			p=p.hashTableNext;
		}
		return null;
	}
	void print()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.println(p.key+" "+p.value);
			p=p.linkedListNext;
		}
	}
	void add(int key,String value)
	{
		Node n=new Node(key, value);
		//add to hashtable
		int index=key%a.length;
		if(a[index]==null)
			a[index]=n;
		else
		{
			Node p=a[index];
			while(p.hashTableNext!=null)
			{
				p=p.hashTableNext;
			}
			p.hashTableNext=n;
		}
		//add to LinkedList
		if(head==null)
			head=n;
		else
		{
			Node p=head;
			while(p.linkedListNext!=null)
			{
				p=p.linkedListNext;
			}
			p.linkedListNext=n;
		}
	}
}























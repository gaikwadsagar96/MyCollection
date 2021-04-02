package Practice;
public class MyhashMapIntKey 
{
	Node1 a[]=new Node1[5];
	void add(int key,String value)
	{
		int index=key%5;
		if(a[index]==null)
		{
			a[index]=new Node1(key, value);
		}
		else
		{
			Node1 p=a[index];
			while(p.next!=null)
				p=p.next;
			p.next=new Node1(key, value);
		}
	}
	void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
			Node1 p=a[i];
			while(p!=null)
			{
				System.out.print(p.key+ " "+ p.value);
				p=p.next;
			}
			System.out.println();
		}
	}
	public String get(int key) 
	{
		int index=key%a.length;
		Node1 p=a[index];
		while(p!=null)
		{
			if(p.key==key)
			{
				return p.value;
			}
			p=p.next;
		}
		return "Not found";
	}
	
}

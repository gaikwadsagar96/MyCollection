package Practice;

public class HashMapStringAsKey 
{
	Node2 a[]=new Node2[5];
	void add(String key,int value)
	{
		int hash=key.hashCode()%a.length;
		if(hash<0)
			hash=hash*-1;
		int index=hash%a.length;
		if(a[index]==null)
			a[index]=new Node2(key, value);
		else
		{
			Node2 p=a[index];
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=new Node2(key, value);
		}
	}
	void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
			Node2 p=a[i];
			while(p!=null)
			{
				System.out.print(p.key+" "+p.value);
				p=p.next;
			}
			System.out.println();
		}
	}
	 int get(String key) 
	{
		int hash=key.hashCode()%a.length;
		if(hash<0)
			hash=hash*-1;
		int index=hash%a.length;
		Node2 p=a[index];
		while(p!=null)
		{
			if(p.key.compareTo(key)==0)
			{
				return p.value;
			}
			p=p.next;
		}
		return Integer.MIN_VALUE;
	}
}

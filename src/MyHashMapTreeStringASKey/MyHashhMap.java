package MyHashMapTreeStringASKey;

public class MyHashhMap 
{
	Node []a=new Node[5];
	void add(String key,int value)
	{
		int hash=key.hashCode()%a.length;
		if(hash<0)//if hash value is negative we have to change it to positive because index not be negative 
				hash=hash*-1;
		int index=hash%a.length;
		if(a[index]==null)
		{
			a[index]=new Node(key,value);
		}
		else
		{
			Node p=a[index];
			while(p.next!=null)
			{
				p=p.next;
			}
			p.next=new Node(key, value);
		}
	}
	int get(String key)
	{
		int hash=key.hashCode()%a.length;
		if(hash<0)
				hash=hash*-1;
		int index=hash%a.length;
		Node p=a[index];
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
	public void print() 
	{
		for (int i = 0; i < a.length; i++) 
		{
			Node p=a[i];
			while(p!=null)
			{
				System.out.print(p.key+" "+p.value);
				p=p.next;
			}
			System.out.println();
		}
	}
}






















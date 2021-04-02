package com.hashmapkeyAsInt;

public class Hashmap 
{
	Node[] a=new Node[5];
	void Print()
	{
		for (int i = 0; i < a.length; i++) 
		{
			Node p=a[i];
			while(p!=null)
			{
				System.out.println(p.key+" "+p.value);
				p=p.next;
			}
		}
	}
	void add(int key,String value)
	{
		int index=key%5;
		if(a[index]== null)
		{
			a[index]=new Node(key, value);
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
}



























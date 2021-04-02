package com.hefshine.collecction;
public class LinkeddList 
{
	Node head;
	void print()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println();
	}
	void add(int data) 
	{
		if(head==null)
		{
			head =new Node(data);
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
	int find(int a)
	{
		int index=-1;
		int n=0;
		Node p=head;
		while(p!=null)
		{
			if(p.data==a)
			{
				index=n;
				break;
			}
			p=p.next;
			n++;
		}
		return index;
	}
	
	void delete(int a)
	{
		Node p=head;
		if(p!=null&& p.data==a)
		{
			head=p.next;
		}
		else
		{
			Node q=p.next;
			while(q!=null)
			{
				if(q.data==a)
				{
					p.next=q.next;
					break;
				}
				p=p.next;
				q=q.next;
			}
		}
	}
	
	void addAtIndex(int index,int data)
	{
		boolean transfer=false;
		Node n=new Node(data);
		Node p=head;
		int i=1;
		while(p!=null && index>0)
		{
			i++;
			p=p.next;
			if(i==index)
			{
				transfer=true;
				break;
			}
		}
		if(transfer)
		{
			n.next=p.next;
			p.next=n;
		}
	}
}













































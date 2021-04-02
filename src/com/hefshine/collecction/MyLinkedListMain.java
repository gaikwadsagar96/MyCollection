package com.hefshine.collecction;

public class MyLinkedListMain 
{

	public static void main(String[] args) 
	{
		LinkeddList llist=new LinkeddList();
		llist.add(10);
		llist.add(11);
		llist.add(10);
		llist.add(12);
		llist.add(13);
		llist.add(14);
		llist.add(15);
		llist.add(16);
		llist.add(17);
		llist.add(18);
		llist.add(19);
		llist.add(20);
		llist.print();
		System.out.println(llist.find(20));
		llist.addAtIndex(2, 9);//1st and 2nd not working start index with 1
		llist.print();
		llist.delete(20);
		llist.print();
	}

}

package Practice;

public class MyHashMapIntKeyMain 
{

	public static void main(String[] args) 
	{
		MyhashMapIntKey hm=new MyhashMapIntKey();
		hm.add(2, "sagar");
		hm.add(1,"prafull" );
		hm.add(2,"shubham" );
		hm.add(3,"Nikhil" );
		hm.add(4,"prafull" );
		hm.add(5,"mustaq" );
		hm.add(6,"prafull" );
		hm.print();
		System.out.println(hm.get(3));
		
	}

}

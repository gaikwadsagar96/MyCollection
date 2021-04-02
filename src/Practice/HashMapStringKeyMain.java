package Practice;

public class HashMapStringKeyMain 
{

	public static void main(String[] args) 
	{
		HashMapStringAsKey hm=new HashMapStringAsKey();
		hm.add("One", 1);
		hm.add("three", 3);
		hm.add("five", 5);
		hm.add("two", 2);
		hm.print();
		System.out.println(hm.get("One"));

	}
}

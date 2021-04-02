package MyHashMapTreeStringASKey;

public class MyHashMapStringKeyMain 
{
	public static void main(String[] args) 
	{
		MyHashhMap map=new MyHashhMap();
		map.add("One", 1);
		map.add("four", 4);
		map.add("Two", 2);
		map.add("Three", 3);
		System.out.println(map.get("One"));
		map.print();

	}

}

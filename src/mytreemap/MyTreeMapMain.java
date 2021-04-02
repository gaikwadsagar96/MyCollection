package mytreemap;

public class MyTreeMapMain 
{

	public static void main(String[] args)
	{
		MyTreeMap tm=new MyTreeMap();
		tm.add(5,"five");
		tm.add(4, "four");
		tm.add(6, "Six");
		tm.add(1, "One");
		tm.add(3, "three");
		tm.add(7, "seven");
		tm.add(8, "eight");
		tm.add(2, "two");
		//tm.print();
		System.out.println(tm.get(9));
	}

}

package LinkedHashmap;

public class LinkedHashhMapMain 
{

	public static void main(String[] args) 
	{
		LinkedHashhMap m=new LinkedHashhMap();
		m.add(2,"DDLJ");
		m.add(15,"Zapatlela" );
		m.add(16,"Jab We Met" );
		m.add(20,"Gajhani" );
		m.add(9,"Burfy" );
		m.add(22,"Lagan" );
		m.add(23,"Iron Man" );
		m.add(7,"Super 30" );
		
		m.add(21,"Chakde india" );
		m.add(17,"Anaconda" );
		m.add(3,"Jersey" );
		m.add(19,"Theri" );
		
		m.add(27,"MSD" );
		m.add(18, "ChennaiExpress");
		m.add(6, "Maherchi Sadi");
		m.print();
		System.out.println(m.get(15));
	}

}

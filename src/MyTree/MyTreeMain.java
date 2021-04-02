package MyTree;

public class MyTreeMain 
{

	public static void main(String[] args) 
	{
		MyTree t=new MyTree();
		/*t.add(50);
		t.add(40);
		t.add(30);
		t.add(45);
		t.add(70);
		t.add(60);
		t.add(80);*/

		t.add1(50);
		t.add1(40);
		t.add1(30);
		t.add1(45);
		t.add1(70);
		t.add1(60);
		t.add1(80);
		t.print();
		System.out.println(t.contains(60));
	}

}

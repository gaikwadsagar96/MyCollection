package Practice;

public class MyArrayList 
{
	int a[]=new int[5];
	int index=0;
	void add(int data)
	{
		if(index<a.length)
		{
			a[index]=data;
			index++;
		}
		else
		{
			int b[]=new int[(int) (1.5*a.length)];
			for (int i = 0; i < a.length; i++)
			{
				a[i]=b[i];
			}
			b[index]=data;
			index++;
			a=b;
		}
	}
	void print()
	{
		for (int i = 0; i < index; i++) 
		{
			System.out.print(a[i]+" ");
		}
	}
}

package TreeMapcomparable;

public class Student implements Comparable<Student> 
{
	int rn;
	String name;
	int Marks;
	public Student(int rn, String name, int marks) 
	{
		super();
		this.rn = rn;
		this.name = name;
		Marks = marks;
	}
	public int compareTo(Student s)
	{
		if(s.Marks>Marks)
			return -1;
		else if(s.Marks<Marks)
			return 1;
		else
			return 0;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", Marks=" + Marks + "]";
	}
	
	
}

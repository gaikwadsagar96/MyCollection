package Practice;

public class pattern {
	public static void main(String[] args) {
		for (int i = 0; i <7; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if( (j==0&&i!=0)|| (j==4&&i>0) ||(i==0&&j>0&&j<4) ||(i==3))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		System.out.println("------------------------------------------");
		for (int i = 0; i <7; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if( ((i==0||i==3||i==6)&&(j<4)) ||(j==4&&i!=0&&i!=3&&i!=6) ||j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------120-----------------------");
		
		for (int i = 0; i <7; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				if( ((i==0||i==6)&&(j<5)) ||(j==4&&i>2)||(i==3)&&( (j==0)||(j>2)) ||j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
System.out.println("-------------------78-----------------------");
		
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < 20; j++) 
			{
				if( (j-i<=0 && j<5)||(i+j<=9 && j>4&&j<10)||(j-i>=10&& j>9&&j<15)||(i+j>=19&&j>14) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
System.out.println("-------------------78-----------------------");
		
		for (int i = 0; i < 7; i++) 
		{
			for (int j = 0; j < 5; j++) 
			{
				if(((i==5||i==0)&&(j>0&&j<4))||((i==6)&&(j==3))||((j==0||j==4)&&(i>0&&i<5))||(i==4 &&j==1))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
}

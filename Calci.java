import java.util.Scanner;

public class Calci
{
	
	Scanner scan = new Scanner(System.in);
	
	public void m1()
	{
	System.out.println("Enter value of A and B");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = a+b;
	System.out.println(c);
	}	

	public void m2()
	{
	System.out.println("Enter value of X and Y");
	int x = scan.nextInt();
	int y = scan.nextInt();
	int z = x-y;
	System.out.println(z);
	}	
	
}
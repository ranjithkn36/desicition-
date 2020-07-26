package ifelse;

public class practice1 
{
public static void main(String[]args)
{
	int a = 7;
	int b = 1;
	int c = 0;
	
	if(a>b)
	{
		if(a>c)
		{
			System.out.println("a is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
	else
	{
		if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}
}

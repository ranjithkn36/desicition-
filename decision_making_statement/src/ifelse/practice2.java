package ifelse;

public class practice2 
{
	public static void main(String[]args)
	{
		int a=30;
		int b=50;
		int c=10;
		int d=3;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a);
				}
				else
				{
					System.out.println(d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c);
				}
				else
				{
					System.out.println(d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println(b);
				}
				else
				{
					System.out.println(d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(c);
				}
				else
				{
					System.out.println(d);
				}
			}
		}
	}

}

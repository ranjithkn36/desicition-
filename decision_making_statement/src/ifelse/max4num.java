package ifelse;

public class max4num 
{
	public static void main(String[]args)
	{
		int a=75;
		int b=20;
		int c=30;
		int d=60;
		
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				System.out.println(a);
			else
				System.out.println(d);
			}
			else
			{
				if(c>d)
				System.out.println(c);
			else
				System.out.println(d);
			
			}
		}
		else 
		{
			if(b>c)
			{if(b>d)
				System.out.println(b);
			else
				System.out.println(d);
			
			}
			else {
				if(c>d)
					System.out.println(c);
				else
					System.out.println(d);
				
			}
		}
		
		
		
	}

}

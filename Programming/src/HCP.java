
public class HCP
{
	
	
		
	
	public static void main(String[] args) 
	{
		int min=0;
		int x=30;
		int y=9;

		
	if(x<y)
	{
		min=x;
	}
	else
	{
		min=y;
	}
	
		
		
		int gcd=0;
		
		for(int i=min;i>=1;i--)
		{
			if(x% i==0 && y% i==0 )
			{
				
				gcd=i;
					break;
			}
			
		}
		System.out.println(gcd+" is G.C.D");
		
		
	}
	

	}



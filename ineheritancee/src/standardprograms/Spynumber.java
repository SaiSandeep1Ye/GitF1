package standardprograms;

class Spynumber 
{
public static void main(String [] args)
{
	for(int i=1;i<=1000;i++)
	{
		int temp=i;
		int sum=0;
		int prod=1;
		while(temp>0)
		{
			int digit=temp%10;
			sum=sum+digit;
			prod=prod*digit;
			temp=temp/10;
		}
		if(sum==prod)
		{
			System.out.println(i);
		}
	}
	
}
}

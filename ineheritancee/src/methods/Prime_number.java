package methods;

class Prime_number
{
public static int Strongcheck(int n)
{
	int temp=n;
	int sum=0;
	while(temp>0)
	{
		int d=temp%10;
		int prod=1;
		for(int i=d;i>=1;i--)
		{
			prod=prod*i;
		}
		sum+=prod;
		temp=temp/10;
	}
	if(sum==n)
	{
		return 1;
	}
	return 0;
}
public static void main(String [] args)
{
	System.out.println("ms");
	for(int i=1;i<=1000;i++)
	{
		if(Strongcheck (i)!=0)
		{
			System.out.println(i);
		}
	}
}
}

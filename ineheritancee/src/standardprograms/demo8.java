package standardprograms;

public class demo8
{
	public static void main(String[] args)
	{
	int row=5;
	int col=row;
	char c='a';
	for(int i = 1;i<=row;i++)
	{
		for(int j=1;j<=col;j++)
		{
			
		if(j%2==0)
		{
			System.out.print(c+++"* ");
		}
		else {
			System.out.print(c+++"# ");
		}
			}
			
		

		System.out.println();
	}
	}
}

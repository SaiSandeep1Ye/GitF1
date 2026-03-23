package stringprograms;

public class Palindromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=46964;
		int originalNumber=num;
		int rev=0;
		while(num!=0)
		{
			m rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);

	

	if(rev==originalNumber)
	{
		System.out.println("it is palindrome");
	}
	else
	{
		
		System.out.println("it is not palindrome");

}
	}
}



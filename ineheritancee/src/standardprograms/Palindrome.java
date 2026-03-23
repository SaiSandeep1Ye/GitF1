package standardprograms;

public class Palindrome {

	public static void main(String[] args) {
		String s="priyanka";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{		
			rev=rev+s.charAt(i);
		
		}
		System.out.println(rev);
	if(rev.equals(s)) 
	{		
	
		System.out.println("is a palindrome");
	}
	else
	{
		System.out.println("it is not palindrome");
	}
		
	}

}


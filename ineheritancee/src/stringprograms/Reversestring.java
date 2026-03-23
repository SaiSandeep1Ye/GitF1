package stringprograms;

public class Reversestring {

	public static void main(String[] args) {
		String s="priyanka";
		String reverse = "";
		char[] a = s.toCharArray();
		// TODO Auto-generated method stub
		for(int i=a.length-1;i>=0;i--)
		{
			reverse=reverse+a[i];
		}
		System.out.println(reverse);

	}
	

}


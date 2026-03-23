package stringprograms;

public class Duplicatevalues {

	public static void main(String[] args) {
		String s="priyanka";
		char rev=' ';
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					rev=a[j];
					
			}
		}
	
		System.out.println(rev);

	
	}	
}




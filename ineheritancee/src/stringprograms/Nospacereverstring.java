package stringprograms;

public class Nospacereverstring {

	public static void main(String[] args) {
		String s="this is a java program",s1="";
		String nospace = s.replace(" ","");
		char c[]=nospace.toCharArray();
		for(int i=nospace.length()-1;i>=0;i--) {
			s1=s1+c[i];
			
		}
System.out.println(s1);
	}

}

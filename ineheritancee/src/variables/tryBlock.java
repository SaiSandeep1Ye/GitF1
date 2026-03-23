package variables;

public class tryBlock {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			System.out.println("handled");
		
		System.out.println("priyanka".charAt(10));
		System.exit(0);
	}
	    finally {
	    	
	    	System.out.println("finally");
	}
}

}
	
		
		
		
		
		

	



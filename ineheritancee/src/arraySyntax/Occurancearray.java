package arraySyntax;

public class Occurancearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[] = {1, 2, 2, 5,6,1,6};

			for (int i = 0; i < a.length; i++) {  
			        int count = 0;  

			        // check if element already counted  
			        for (int j = 0; j < a.length; j++) {  
			            if (a[i] == a[j]&&i>j) {  
			                break;  
			            }  

			        if (a[i]==a[j]) {  
			            count++;  
			        }

			}

			if (count>0) {

			System.out.println("the frequency of"+a[i]+"is: "+count+"times");
			}
			
			}
			
			}
			

	}



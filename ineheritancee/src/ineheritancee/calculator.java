package ineheritancee;

class calculator {
	
	 
	
	    public static int add(int i, int j) {
	        int c = i + j;
	        return c;
	    }

	    public static double add(double i, double j) {
	        double c = i + j;
	        return c;
	    }

	    public static int add(int i, int j, int k) {
	        int l = i + j + k;
	        return l;
	    }

	    public static void main(String[] args) {
	        System.out.println("main starts");

	        System.out.println(add(10, 20));        // Line 1
	        System.out.println(add(10.5, 11.5));    // Line 2
	        System.out.println(add(2, 3, 4));       // Line 3

	        System.out.println("main ends");
	    }
	}

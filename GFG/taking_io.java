//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Geeks{
    
    // Function to take input using Scanner class
    static void IOFunction(){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int a = sc.nextInt();
		    float f = sc.nextFloat();
		    long l = sc.nextLong();
		    byte b = sc.nextByte();
		    
		    String s = sc.nextLine();
		    // Your code here
		    System.out.println(a);
		    System.out.println(f);
		    System.out.println(l);
		    System.out.println(b);
		    System.out.println(s);
		    
		    
		}
		
    }
    
}

//{ Driver Code Starts.


class GFG {
    
    // Driver Code
    public static void main (String[] args) {
	    
	       //Creating an object of class Geeks
	       Geeks g = new Geeks();
		
		   //Calling the IOFunction() of class Geeks
		   g.IOFunction();
	}
}
// } Driver Code Ends

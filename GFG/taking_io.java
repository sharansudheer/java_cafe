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
		    // Your code here
		     int a = sc.nextInt();
		     System.out.println(a);

		     float b = sc.nextFloat();
		     System.out.println(b); 

		     long c = sc.nextLong();
		     System.out.println(c);

		     byte d= sc.nextByte();
		     System.out.println(d);

		 /* 
         * At this point, the scanner is still on the fourth line at the end
         * of the byte, so we need to move the scanner to the next line
         * scans to the end of the previous line which contains the byte. 
         */
		     sc.nextLine();
		     String s = sc.nextLine();
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

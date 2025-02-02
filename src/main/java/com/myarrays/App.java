package com.myarrays;

/**
 * Hello world!
 *
 */
public class App 

{
	void largestNumber(int a[]){
		int min=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<min)
				min =a[i];
		}
		System.out.println(min);
		
	}
	
	
    public static void main( String[] args )
    {
    	new App().largestNumber(new int[] {11,12,34,45,56,67,89,1});;
//        System.out.println( "Hello World!" );
    }
}

package com.myarrays;

/**
 * Hello world!
 *
 */
public class App

{
	void largestNumber(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println(max);

	}

	void secondLargestNumber(int a[]) {
		int max = a[0];
		int smax = Integer.MIN_VALUE;
		for (int i = 1; i < a.length; i++) {
			int tsmax = Integer.MIN_VALUE;
			if (a[i] > max) {
				smax = max;
				max = a[i];

			}
			if (a[i] < max) {
				tsmax = a[i];
			}
			if(tsmax>smax) {
				smax=tsmax;
			}
		}

		System.out.println(smax);
	}

	public static void main(String[] args) {
		new App().secondLargestNumber(new int[] { -12, -12, -1, -4, -5, -7, -9, -1 });
		;
//        System.out.println( "Hello World!" );
	}
}

package com.myarrays;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App

{
	void arrayLargestNumber(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println(max);
//		TC => N
//		SC => 1

	}

	void arraySecondLargestNumber(int a[]) {
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
			if (tsmax > smax) {
				smax = tsmax;
			}
		}

		System.out.println(smax);
//		TC => N
//		SC => 1
	}

	void arrayIsSorted(int[] a) {
		boolean isSorted = true;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				isSorted = false;
				break;
			}
		}

		System.out.println(isSorted ? "SORTED" : "NOT SORTED");
//		TC => N
//		SC => 1

	}

	void arrayRemoveDuplicates(int[] a) {
		int i = 0,j=0;
		while (i < a.length && j < a.length) {
			if (a[i] == a[j])
				j++;
			else {
				i++;
				a[i] = a[j];
			}
		}
		
		for (int i1 = 0; i1 <= i ; i1++) {
			System.out.println(a[i1]);
		}

	}

	public static void main(String[] args) {
		new App().arrayRemoveDuplicates(new int[] {1,1,2 });
		;
//        System.out.println( "Hello World!" );
	}
}

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
		int i = 0, j = 0;
		while (i < a.length && j < a.length) {
			if (a[i] == a[j])
				j++;
			else {
				i++;
				a[i] = a[j];
			}
		}

		for (int i1 = 0; i1 <= i; i1++) {
			System.out.println(a[i1]);
		}
//		TC => N
//		SC => 1

	}

	void arrayRotate(int[] a, int mk) {
		int k = mk % a.length;
		arrayReverse(a, 0, a.length - k - 1);
		arrayReverse(a, a.length - k, a.length - 1);
		arrayReverse(a, 0, a.length - 1);

		for (int sts = 0; sts < a.length; sts++) {
			System.out.print(a[sts]);
		}

//		TC => N
//		SC => 1
	}

	void arrayReverse(int a[], int s, int e) {
		int i = s;
		int j = e;

		while (i < j) {

			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;

			i++;
			j--;
		}

	}

//	void arrayZeroToEnd(int a[]){
//		int cz=0;
//		for (int i = 0; i < a.length-cz; ) {
//			if(a[i]== 0) {
//				cz+=1;
//				for (int j = i; j < a.length-1; j++) {
//					a[j]=a[j+1];
//				}
//				a[a.length-1]=0;
//			}
//			else
//				i++;	
//		}
//		
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//	}

	void arrayZeroToEnd(int a[]) {
		int i = 0;
		for (int j = 0; j < a.length; j++) {
			if (a[j] != 0) {
				a[i++] = a[j];
			}
		}
		while (i < a.length) {
			a[i++] = 0;
		}
//			TC => N
//			SC => 1
	}

	boolean arrayLinearSearch(int[] a, int k) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == k)
				return true;
		}
		return false;
//		TC => N
//		SC => 1
	}

	void arrayMaxConsecutiveOnes(int[] nums) {
		int max=0,count=0;
	     for(int i=0;i<nums.length;i++){
	        if(nums[i]==1){
	            count++;
	        }else{
	             max = Math.max(max, count);
	            count=0;
	        }
	        max = Math.max(max, count);
	     }   
		System.out.println(max);
//		TC => N
//		SC => 1
		
	}
	
	void arraymissingNumber(int[] nums) {
		int sum =0;int max=nums.length;
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
		}
		
		System.out.println((max*(max+1)/2-sum));
	}

	public static void main(String[] args) {
		new App().arraymissingNumber(new int[] {  9,6,4,2,3,5,7,0,1 });
		;
//        System.out.println( "Hello World!" );
	}
}
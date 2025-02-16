package com.myarrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

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
		int max = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else {
				max = Math.max(max, count);
				count = 0;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
//		TC => N
//		SC => 1

	}

	void arraymissingNumber(int[] nums) {
		int sum = 0;
		int max = nums.length;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}

		System.out.println((max * (max + 1) / 2 - sum));
	}

	void arraysingleNumber(int[] nums) {
		int zero = 0;
		for (int i = 0; i < nums.length; i++) {
			zero = zero ^ nums[i];
		}

//		TC => N
//		SC => 1
		System.out.println(zero);
	}

//	void arrayUnionOf2Sorted(int[] num1, int[] num2) {
//		ArrayList<Integer> ra=new ArrayList<Integer>();
//		int[] num = new int[num1.length + num2.length+1];
//		int idx = -1;
//		int i = 0, j = 0;
//		for (; i < num1.length && j < num2.length;) {
//			idx = idx < 0 ? 0 : idx;
//			if (num1[i] < num2[j]) {
//				if (num1[i] == num[idx]) {
//					i++;
//				} else {
//					idx++;
//					num[idx] = num1[i];
//					i++;
//				}
//			} else if (num2[j] < num1[i]) {
//				if (num2[j] == num[idx]) {
//					j++;
//				} else {
//					idx++;
//					num[idx] = num2[j];
//					j++;
//				}
//			} else {
//				if (num2[j] == num[idx]) {
//					j++;
//					i++;
//				} else {
//					idx++;
//					num[idx] = num2[j];
//					j++;
//					i++;
//				}
//
//			}
//		}
//		for (; i < num1.length;) {
//				if (num1[i] == num[idx]) {
//					i++;
//				} else {
//					idx++;
//					num[idx] = num1[i];
//					i++;
//				}
//		}
////
//		for (; j < num2.length; ) {
//			if (num2[j] == num[idx]) {
//				j++;
//			} else {
//				idx++;
//				num[idx] = num2[j];
//				j++;
//			}
//		}
//		for (int k = 1; k <= idx; k++) {
//			ra.add(num[k]);
//		}
//
////		System.out.println(zero);
//	}
	
	void arrayUnionOf2Sorted(int[] num1, int[] num2) {
        List<Integer> ra = new ArrayList<>();
        int i = 0, j = 0;
        Integer lastAdded = null; // Track the last added number to avoid duplicates

        while (i < num1.length && j < num2.length) {
            if (num1[i] < num2[j]) {
                if (lastAdded == null || lastAdded != num1[i]) {
                    ra.add(num1[i]);
                    lastAdded = num1[i];
                }
                i++;
            } else if (num2[j] < num1[i]) {
                if (lastAdded == null || lastAdded != num2[j]) {
                    ra.add(num2[j]);
                    lastAdded = num2[j];
                }
                j++;
            } else { // num1[i] == num2[j]
                if (lastAdded == null || lastAdded != num1[i]) {
                    ra.add(num1[i]);
                    lastAdded = num1[i];
                }
                i++;
                j++;
            }
        }

        // Add remaining elements from num1
        while (i < num1.length) {
            if (lastAdded == null || lastAdded != num1[i]) {
                ra.add(num1[i]);
                lastAdded = num1[i];
            }
            i++;
        }

        // Add remaining elements from num2
        while (j < num2.length) {
            if (lastAdded == null || lastAdded != num2[j]) {
                ra.add(num2[j]);
                lastAdded = num2[j];
            }
            j++;
        }
//		TC => N ;where N=n1+n2
//		SC => N

        System.out.println(ra);
    }
	

	void arrayIntersectionOf2Sorted(int[] num1, int[] num2) {
        List<Integer> ra = new ArrayList<>();
        int i = 0, j = 0;
        Integer lastAdded = null; // Track the last added number to avoid duplicates

        while (i < num1.length && j < num2.length) {
           if( num1[i] == num2[j]) {
                if (lastAdded == null || lastAdded != num1[i]) {
                    ra.add(num1[i]);
                    lastAdded = num1[i];
                }
                i++;
                j++;
            }
        }

     
//		TC => N ;where N=n1+n2
//		SC => N

        System.out.println(ra);
    }
	
//	void longestSumArraySumK(int[] num,int k){
//		int maxLength=0;
//		for (int i = 0; i < num.length; i++) {
//			int sum=0;
//			for (int j = i; j < num.length; j++) {
//				sum=sum + num[j];
//				if(sum == k) {
//					int length=(j-i+1);
//					maxLength= Math.max(maxLength, length);
//				}
//			}
//			
//		}
//	TC => N^2 
//	SC => 1
//		System.out.println(maxLength);
//		
//	}
	void longestSumArraySumK(int[] num,int k){
		int prefixSum=0;
		int length=0;
		HashMap<Integer, Integer> lengthHashMap=new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			prefixSum=prefixSum+num[i];
			
			if(prefixSum==k) {
				length=i+1;
			}
			
			else if(lengthHashMap.containsKey(prefixSum-k)) {
				length=Math.max(length, i-lengthHashMap.get(prefixSum-k));
			}
			
			
			if(!lengthHashMap.containsKey(prefixSum)) {
				lengthHashMap.put(prefixSum, i);
			}
			
		}
		System.out.println(length);
//		TC => N
//		SC => N
	}
	
	


	public static void main(String[] args) {
		new App().longestSumArraySumK(new int[] {10, 5, 2, 7, 1, -10}, 15);
		;
//        System.out.println( "Hello World!" );
	}
}
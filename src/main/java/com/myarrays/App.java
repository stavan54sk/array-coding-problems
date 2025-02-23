package com.myarrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
			if (num1[i] == num2[j]) {
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

//	void arrayLongestSumArraySumK(int[] num,int k){
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
	void arrayLongestSumArraySumK(int[] num, int k) {
		int prefixSum = 0;
		int length = 0;
		HashMap<Integer, Integer> lengthHashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			prefixSum = prefixSum + num[i];

			if (prefixSum == k) {
				length = i + 1;
			}

			else if (lengthHashMap.containsKey(prefixSum - k)) {
				length = Math.max(length, i - lengthHashMap.get(prefixSum - k));
			}

			if (!lengthHashMap.containsKey(prefixSum)) {
				lengthHashMap.put(prefixSum, i);
			}

		}
		System.out.println(length);
//		TC => N
//		SC => N
	}

	private void mergeSort(int[] a, int s, int e) {
		if (s >= e)
			return; // Base case improvement

		int mid = s + (e - s) / 2; // Avoid overflow
		mergeSort(a, s, mid);
		mergeSort(a, mid + 1, e);
		merge(a, s, mid, e);
	}

	private void merge(int[] a, int s, int m, int e) {
		int[] temp = new int[e - s + 1];
		int k = 0, i = s, j = m + 1;

		while (i <= m && j <= e) {
			temp[k++] = (a[i] <= a[j]) ? a[i++] : a[j++];
		}

		while (i <= m)
			temp[k++] = a[i++];
		while (j <= e)
			temp[k++] = a[j++];

		for (int l = 0; l < temp.length; l++) {
			a[s + l] = temp[l];
		}

	}

	int[] array2Sum(int[] num, int k) {
		int[] r = new int[] { -1, -1 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			if (hm.containsKey(k - num[i])) {
				r[0] = i;
				r[1] = hm.get(k - num[i]);
				return r;
			} else {
				hm.put(num[i], i);
			}
		}
		return r;

	}

	void array012Sort(int[] num) {
		int l = 0, m = 0, h = num.length - 1;
		while (m <= h) {
			if (num[m] == 0) {
				int temp = num[l];
				num[l] = num[m];
				num[m] = temp;
				l++;
				m++;
			} else if (num[m] == 1) {
				m++;
			} else {
				int temp = num[m];
				num[m] = num[h];
				num[h] = temp;
				h--;
			}
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}

//	int arrayElementGraterThanNby2(int[] num) {
//		int val=0;
//		for (int i = 0; i < num.length; i++) {
//			int f = 0;val=num[i];
//			for (int j = i + 1; j < num.length; j++) {
//				if (val == num[j])
//					f++;
//			}
//			if(f>=num.length/2)
//				return num[i];
//		}
//
//		return val;
//	}

	void arrayElementGraterThanNby2(int[] num) {
		int f = 0, r = 0;

		for (int i = 0; i < num.length; i++) {
			if (f == 0)
				r = num[i];
			if (num[i] == r)
				f++;
			else
				f--;
		}
		System.out.println("Majority Element (Candidate): " + r);
	}

	int arrayMaxSubArraySum(int[] num) {
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			cs = cs + num[i];
			ms = Math.max(ms, cs);
			if (cs < 0)
				cs = 0;
		}

		return ms;
	}

	int arraySellBuy(int[] num) {
		int cd;
		int md = 0;
		for (int i = 0; i < num.length; i++) {
			cd = 0;
			for (int j = i + 1; j < num.length; j++) {
				md = Math.max(md, num[j] - num[i]);
			}
		}

		return md;
	}

	int[] arrayPNAlternate(int[] num) {

		int[] r = new int[num.length];
		int pp = 0; // Position for positives (even indices)
		int np = 1; // Position for negatives (odd indices)

		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				r[pp] = num[i];
				pp += 2; // Move to next even index
			} else {
				r[np] = num[i];
				np += 2; // Move to next odd index
			}
		}
		return r;

	}

//	ArrayList<Integer> arrayLeaders(int[] num) {
//		ArrayList<Integer> hm=new ArrayList<Integer>();
//		for (int i = 0; i < num.length; i++) {
//			boolean il = true;
//			for (int j = i + 1; j < num.length; j++) {
//				if (num[j] > num[i]) {
//					il=false;
//					break;
//				}
//			}
//			if(il)
//				hm.add(num[i]);
//		}
//		
//			
//			return hm;
//
//	}

	ArrayList<Integer> arrayLeaders(int[] num) {
		int l = num[num.length - 1];
		ArrayList<Integer> lds = new ArrayList<Integer>();

		for (int i = num.length - 1; i >= 0; i--) {
			if (num[i] >= l) {
				lds.add(num[i]);
				l = num[i];
			}

		}
		Collections.reverse(lds);
		return lds;
	}

	 private static void  quickSort(int[] num, int s, int e) {
		if (s <= e) {
			int pi = partition(num, s, e);
			quickSort(num, s, pi - 1);
			quickSort(num, pi + 1, e);
		}
		return;
	}

	 private static int partition(int[] num, int s, int e) {
		// TODO Auto-generated method stub
		int idx = s - 1;
		int p = num[e];
		for (int i = s; i < e; i++) {
			if (num[i] <= p) {
				idx++;
				int temp = num[idx];
				num[idx] = num[i];
				num[i] = temp;
			}
		}

		idx++;
		int temp = num[idx];
		num[idx] = num[e];
		num[e] = temp;

		return idx;
	}

	void arrayNextPermutation(int[] num) {
		 int n = num.length;
	        int pi = -1;

	        // Step 1: Find the first decreasing element from the right
	        for (int i = n - 2; i >= 0; i--) {
	            if (num[i] < num[i + 1]) {
	                pi = i;
	                break;
	            }
	        }

	        // Step 2: If no such element found, reverse the array (last permutation case)
	        if (pi == -1) {
	            quickSort(num, 0, n-1);
	            return;
	        }

	        // Step 3: Find the smallest number greater than num[pi] from the right
	        int mi = pi + 1;
	        for (int j = n-1; j >=pi+1 ; j--) {
	            if (num[j] > num[pi]) {
	                mi = j;
	                break;
	            }
	        }

	        // Step 4: Swap num[pi] and num[mi]
	        swap(num, pi, mi);

	        // Step 5: Reverse the right part (after pi)
	        reverse(num, pi + 1, n - 1);
	}
	
	 private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	  private static void reverse(int[] arr, int start, int end) {
	        while (start < end) {
	            swap(arr, start, end);
	            start++;
	            end--;
	        }
	    }

	public static void main(String[] args) {
		new App().arrayNextPermutation(new int[] { 2,1,3 });

	}
}
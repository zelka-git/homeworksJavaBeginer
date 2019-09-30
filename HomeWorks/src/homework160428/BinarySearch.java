package homework160428;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] a = {10, 20, -1, 3, 0, 100, -500};

		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int result = binarySearch(a, -1000);
		
		System.out.println("-1000: " + result);
//		System.out.println(a[result]);
		
		result = binarySearch(a, -200);
		
		System.out.println("-200: " + result);
//		System.out.println(a[result]);

		result = binarySearch(a, 200);
		
		System.out.println("200: " + result);
//		System.out.println(a[result]);
		
		result = binarySearch(a, 50);
		
		System.out.println("50: " + result);
//		System.out.println(a[result]);
	}
	
	static int binarySearch(int[] x, int key) {
		//TODO write code for binary search
		int left = 0;
		int right = x.length - 1;
		
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if( x[mid] == key) {
				return mid;
			}
			if (x[mid] > key) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
			
		}
			if (left >= x.length) {
				left = x.length - 1;
			}
			if (x[left] < key) {
				return -(left + 2);
			}else {
				return -(left + 1);
			}
//		return -1;
	}
}

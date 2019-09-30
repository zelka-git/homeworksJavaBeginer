package homework160428;

import java.util.Arrays;

public class MaxArray {
	public static void main(String[] args) {
		int[][] a = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		System.out.println(Arrays.toString(maxArray(a)));
	}
	static int[] maxArray(int[][] x) {
		int[] max = new int[x.length];
		for (int i = 0; i < max.length; i++) {
			max[i] = Integer.MIN_VALUE;
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max[i]) {
					max[i] = x[i][j];
				}
				
			}
		}
		return max;
	}
	
}

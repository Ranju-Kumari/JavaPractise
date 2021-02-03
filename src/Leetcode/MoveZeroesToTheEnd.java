package Leetcode;

import java.util.Scanner;

public class MoveZeroesToTheEnd {

	public static void main(String[] arr) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		moveZeroes(a);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

		sc.close();
	}

	public static void moveZeroes(int[] nums) {
		int j = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			} else {
				count++;
			}
		}
		while (count-- > 0) {
			nums[j++] = 0;

		}

	}

}

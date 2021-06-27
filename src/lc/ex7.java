package lc;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(reverse(x));

	}

	public static int reverse(int x) {
		int carry = 0;
		boolean neg = false;
		int range = (int) Math.pow(2, 31);
		System.err.println(-1*range);
		System.err.println(range);
		if (x >= -1 * range && x < range) {
			if (x < 0) {
				x *= -1;
				neg = true;
			}
			while (x > 0) {
				carry *= 10;
				carry += (x % 10);
				x /= 10;
			}

			carry += x % 10;
			if (neg)
				carry *= -1;
		} else {
			return 0;
		}

		return carry;

	}
}

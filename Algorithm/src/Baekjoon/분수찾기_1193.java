package Baekjoon;

import java.util.Scanner;

public class 분수찾기_1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1, limit = 0, start = 0;
		int denominator = 0; // 분모
		int numerator = 0; // 분자

		while (true) {
			start = limit + 1;
			limit += i;

			if (n <= limit) {
				if (i % 2 == 0) {
					numerator = 1 + (n - start);
					denominator = i - (n - start);

					System.out.println(numerator + "/" + denominator);
					break;
				} else {
					numerator = i - (n - start);
					denominator = 1 + (n - start);

					System.out.println(numerator + "/" + denominator);
					break;
				}
			}

			i++;
		}
	}
}

package Baekjoon;

import java.util.Scanner;

public class 벌집_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int end = 1, i = 0, answer = 0;

		while (true) {
			end += 6 * i;

			if (n <= end) {
				answer = i + 1;
				break;
			}

			i++;
		}

		System.out.println(answer);
	}
}

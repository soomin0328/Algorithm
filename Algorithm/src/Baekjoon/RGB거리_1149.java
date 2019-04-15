package Baekjoon;

import java.util.Scanner;

public class RGB거리_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] dp = new int[n][n];

		dp[0][0] = sc.nextInt();
		dp[1][0] = sc.nextInt();
		dp[2][0] = sc.nextInt();

		for (int i = 1; i < dp.length; i++) {
			dp[0][i] = Math.min(dp[1][i - 1], dp[2][i - 1]) + sc.nextInt();
			dp[1][i] = Math.min(dp[0][i - 1], dp[2][i - 1]) + sc.nextInt();
			dp[2][i] = Math.min(dp[0][i - 1], dp[1][i - 1]) + sc.nextInt();
		}
		
		System.out.println(Math.min(dp[0][n - 1], Math.min(dp[1][n - 1], dp[2][n - 1])));
	}
}
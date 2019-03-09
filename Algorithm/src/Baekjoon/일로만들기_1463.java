package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 일로만들기_1463 {
	static int[] dp = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Arrays.fill(dp, -1);
		System.out.println(DP(num));
	}

	public static int DP(int num) {
		if (num == 1)
			return 0;
		if (dp[num] != -1)
			return dp[num];

		int answer = DP(num - 1) + 1;

		if (num % 3 == 0)
			answer = Math.min(answer, DP(num / 3) + 1);
		if (num % 2 == 0)
			answer = Math.min(answer, DP(num / 2) + 1);
		dp[num] = answer;
		return answer;
	}
}

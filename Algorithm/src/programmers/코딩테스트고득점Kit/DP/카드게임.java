package programmers.코딩테스트고득점Kit.DP;

import java.util.Arrays;

public class 카드게임 {
	static int[] l, r;
	static int[][] dp;

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 5 };
		int[] arr2 = { 2, 4, 1 };

		System.out.println(solution(arr1, arr2));
	}

	public static int solution(int[] left, int[] right) {
		dp = new int[left.length][right.length];
		for (int i = 0; i < left.length; i++) {
			Arrays.fill(dp[i], 0);
		}
		
		l = left;
		r = right;

		return DP(0, 0);
	}

	private static int DP(int lIdx, int rIdx) {
		if (lIdx == l.length || rIdx == r.length) {
			return 0;
		}

		if (dp[lIdx][rIdx] != 0)
			return dp[lIdx][rIdx];

		int answer = 0;

		if (l[lIdx] > r[rIdx]) {
			answer += Math.max(r[rIdx] + DP(lIdx, rIdx + 1), Math.max(DP(lIdx + 1, rIdx), DP(lIdx + 1, rIdx + 1)));
		} else {
			answer += Math.max(DP(lIdx + 1, rIdx + 1), DP(lIdx + 1, rIdx));
		}

		dp[lIdx][rIdx] = answer;

		return answer;
	}
}

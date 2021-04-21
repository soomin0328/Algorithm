package programmers.코딩테스트고득점Kit.DP;

public class 타일장식물 {
	public static void main(String[] args) {
		System.out.println(solution(5));
	}

	public static long solution(int N) {
		long answer = 0;
		long[] dp = new long[81];
		dp[1] = 1;
		dp[2] = 1;
		for (int i = 3; i <= N; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		answer = dp[N] * 2 + (dp[N] + dp[N - 1]) * 2;
		return answer;
	}
}

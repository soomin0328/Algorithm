package programmers.코딩테스트고득점Kit.DP;

public class N으로표현 {
	static int answer = -1;

	public static void main(String[] args) {
		System.out.println(solution(5, 12));
		System.out.println(solution(2, 11));
	}

	private static int solution(int N, int number) {
		dfs(N, 0, 0, number, "");
		return answer;
	}

	private static void dfs(int n, int pos, int num, int number, String s) {
		if (pos > 8)
			return;
		if (num == number) {
			if (pos < answer || answer == -1) {
				answer = pos;
			}
			return;
		}
		int nn = 0;
		for (int i = 0; i < 8; i++) {
			nn = nn * 10 + n;
			dfs(n, pos + 1 + i, num + nn, number, s + "+");
			dfs(n, pos + 1 + i, num - nn, number, s + "-");
			dfs(n, pos + 1 + i, num * nn, number, s + "*");
			dfs(n, pos + 1 + i, num / nn, number, s + "/");
		}
	}
}

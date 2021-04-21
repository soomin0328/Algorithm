package programmers.코딩테스트고득점Kit.DFSBFS;

public class 타겟넘버 {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1 };
		System.out.println(solution(arr, 3));
	}

	static int answer = 0;

	public static int solution(int[] numbers, int target) {
		DFS(numbers, target, 0);
		return answer;
	}

	private static void DFS(int[] numbers, int target, int depth) {
		if (depth == numbers.length) {
			int sum = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}

			if (sum == target) {
				answer++; 
			}
		} else {
			numbers[depth] *= 1;
			DFS(numbers, target, depth + 1);

			numbers[depth] *= -1;
			DFS(numbers, target, depth + 1);
		}
	}
}

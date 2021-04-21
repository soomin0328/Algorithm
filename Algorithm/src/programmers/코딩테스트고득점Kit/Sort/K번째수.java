package programmers.코딩테스트고득점Kit.Sort;

import java.util.Arrays;

public class K번째수 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] arr2 = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = solution(arr1, arr2);
		for (int i : answer) {
			System.out.println(i);
		}
	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int newArr[] = null;

		for (int i = 0; i < commands.length; i++) {
			newArr = new int[(commands[i][1] - commands[i][0]) + 1];
			for (int j = 0; j < (commands[i][1] - commands[i][0]) + 1; j++) {
				newArr[j] = array[commands[i][0] - 1 + j];
			}
			Arrays.sort(newArr);
			answer[i] = newArr[commands[i][2] - 1];
		}

		return answer;
	}
}

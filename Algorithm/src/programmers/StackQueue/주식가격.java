package programmers.StackQueue;

import java.util.Stack;

public class 주식가격 {
	public static void main(String[] args) {
		int[] arr = { 498, 501, 470, 489 };
		int[] answer = solution(arr);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}

	public static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];

		Stack<Integer> index = new Stack<Integer>();

		index.push(1);
		for (int i = 1; i < prices.length; i++) {
			while (!index.isEmpty() && prices[i]<prices[index.peek() - 1]) {
				answer[index.peek() - 1] = (i + 1) - index.peek();
				index.pop();
			}
			index.push(i + 1);
		}

		while (!index.isEmpty()) {
			answer[index.peek() - 1] = prices.length - index.peek();
			index.pop();
		}

		return answer;
	}
}

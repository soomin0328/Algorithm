package programmers.StackQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
	public static void main(String[] args) {
		Dev dev = new Dev();
		int[] arr1 = { 93, 30, 55, 90 };
		int[] arr2 = { 1, 30, 5, 1 };
		int[] answer = dev.solution(arr1, arr2);
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}

class Dev {
	public int[] solution(int[] progresses, int[] speeds) {
		int index = 0, pre = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();

		for (int i = 0; i < progresses.length; i++) {
			q.offer((int) Math.ceil((double) (100 - progresses[i]) / (double) speeds[i]));
		}

		pre = q.poll();
		a.add(1);

		while (!q.isEmpty()) {
			if (pre >= q.peek()) {
				a.set(index, a.get(index) + 1);
			} else {
				index++;
				pre = q.peek();
				a.add(1);
			}
			q.poll();
		}

		int[] answer = new int[a.size()];

		int i = 0;
		for (int num : a) {
			answer[i] = num;
			i++;
		}

		return answer;
	}
}
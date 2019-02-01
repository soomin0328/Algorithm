//프로그래머스 스택/큐 '프린터'

package programmers.StackQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
	public static void main(String[] args) {
		Printer solution = new Printer();
		int[] arr = { 2, 1, 3, 2 };
		System.out.println("answer: " + solution.solution(arr, 2));
	}
}

class Printer {
	public int solution(int[] priorities, int location) {
		int answer = 0, count = 0;

		Queue<Integer> queue = new LinkedList<Integer>();
		Queue<Integer> index = new LinkedList<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i : priorities) {
			queue.offer(i);
			index.offer(queue.size() - 1);
		}

		while (!queue.isEmpty()) {
			int print = queue.poll();
			int printIndex = index.poll();

			for (int q : queue) {
				if (q > print) {
					count++;
				}
			}

			if (count != 0) {
				queue.offer(print);
				index.offer(printIndex);
			} else {
				arr.add(printIndex);
			}

			count = 0;
		}

		answer = arr.indexOf(location) + 1;
		return answer;
	}
}
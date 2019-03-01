package programmers.Heap;

import java.util.PriorityQueue;
import java.util.Queue;

public class 더맵게 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 9, 10, 12 };
		System.out.println(solution(arr, 7));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		Queue<Integer> q = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			q.offer(scoville[i]);
		}

		while (q.peek() < K) {
			q.offer(q.poll() + q.poll() * 2);
			answer++;
			if (q.size() == 1 && q.peek() < K) {
				answer = -1;
				break;
			}
		}

		return answer;
	}
}

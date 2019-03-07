//프로그래머스 스택/큐 '다리를 지나는 트럭'

package programmers.StackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
	public static void main(String[] args) {
		Bridge bridge = new Bridge();
		int[] arr = { 7, 4, 5, 6 };
		System.out.println("answer: " + bridge.solution(2, 10, arr));
	}
}

class Truck {
	int weight, time;

	Truck(int weight, int time) {
		this.weight = weight;
		this.time = time;
	}

}

class Bridge {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int time = 1, total_weight = 0;

		Queue<Truck> q = new LinkedList<Truck>();
		Queue<Integer> wait = new LinkedList<Integer>();

		for (int i : truck_weights) {
			wait.offer(i);
		}
System.out.println();
		total_weight = wait.peek();
		q.offer(new Truck(wait.poll(), bridge_length));

		while (!q.isEmpty()) {
			if (q.peek().time == 1) {
				total_weight -= q.poll().weight;
			}

			for (Truck i : q) {
				i.time -= 1;
			}

			if (wait.size() != 0 && total_weight + wait.peek() <= weight) {
				total_weight += wait.peek();
				q.offer(new Truck(wait.poll(), bridge_length));
			}

			time++;
		}

		return time;
	}
}
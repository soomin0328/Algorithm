//프로그래머스 해시 '위장'

package programmers.Hash;

import java.util.HashMap;

public class 위장 {
	public static void main(String[] args) {
		Hash3 h3 = new Hash3();
		String[][] arr = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		System.out.println(h3.solution(arr));
	}
}

class Hash3 {
	public int solution(String[][] clothes) {
		HashMap<String, Integer> spy = new HashMap<String, Integer>();
		int count = 0;
		int answer = 1;

		for (int i = 0; i < clothes.length; i++) {
			if (spy.containsKey(clothes[i][1])) {
				spy.put(clothes[i][1], spy.get(clothes[i][1]) + 1);
				count++;
			} else {
				spy.put(clothes[i][1], 1);
				count++;
			}
		}

		for (int v : spy.values()) {
			answer *= v + 1;
		}

		return answer - 1;
	}
}
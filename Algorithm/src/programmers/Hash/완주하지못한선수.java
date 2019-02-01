//프로그래머스 해시 '완주하지 못한 선수'

package programmers.Hash;

import java.util.Arrays;

public class 완주하지못한선수 {
	public static void main(String[] args) {
		Hash1 h1 = new Hash1();
		String[] arr1 = { "leo", "kiki", "eden" };
		String[] arr2 = { "eden", "kiki" };
		System.out.println(h1.solution(arr1, arr2));
	}
}

class Hash1 {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				return participant[i];
			}
		}
		return participant[i];
	}
}
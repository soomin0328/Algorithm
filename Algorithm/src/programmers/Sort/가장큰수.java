package programmers.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 가장큰수 {
	public static void main(String[] args) {
		int[] arr = { 6, 10, 2 };
		System.out.println(solution(arr));
	}

	public static String solution(int[] numbers) {
		String answer = "";
		List<String> list = new ArrayList<>();
		int length = numbers.length;

		for (int i = 0; i < length; i++) {
			list.add(Integer.toString(numbers[i]));
		}

		int size = list.size();
		Collections.sort(list, (num1, num2) -> (num2 + num1).compareTo(num1 + num2));

		if (list.get(0).equals("0")) {
			return "0";
		}

		for (int i = 0; i < size; i++) {
			answer = answer + list.get(i);
		}
		return answer;
	}
}

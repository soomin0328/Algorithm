package programmers.월간코드챌린지_시즌1;

import java.util.ArrayList;
import java.util.Collections;

public class 두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,1};
		solution(arr);
	}
	
    public static int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // 더하기
        for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				if (!list.contains(sum)) {
					list.add(sum);
				}
			}
		}
        
        // 정렬
        Collections.sort(list);
        
        // arraylist -> array
        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        
        return answer;
    }
}

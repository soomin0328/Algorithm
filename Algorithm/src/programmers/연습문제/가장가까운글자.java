package programmers.연습문제;

import java.util.HashMap;
import java.util.Map;

public class 가장가까운글자 {

    public static void main(String[] args) {
        solution("foobar");
        // [-1, -1, -1, 2, 2, 2]
    }

    public static int[] solution(String s) {
        int[] answer = {};
        Map<String, Integer> strMap = new HashMap<>();
        
        String[] strArr = s.split("");
        answer = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (strMap.get(strArr[i]) == null) {
                strMap.put(strArr[i], i);
                answer[i] = -1;
            } else {
                answer[i] = i - strMap.get(strArr[i]);
                strMap.put(strArr[i], i);
            }
        }

        return answer;
    }
}

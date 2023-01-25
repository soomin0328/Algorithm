package programmers.연습문제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 최댓값과최솟값 {
    public static void main(String[] args) {
        solution("1 2 3 4");
    }
    
    public static String solution(String s) {
        String answer = "";
        List<Integer> list = new ArrayList<>();
        
        String[] strArr = s.split(" ");
        
        for (String str : strArr) {
            list.add(Integer.parseInt(str));
        }

        Collections.sort(list);

        answer = list.get(0) + " " + list.get(list.size() - 1);
        return answer;
    }
}
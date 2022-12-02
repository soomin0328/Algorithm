package programmers.연습문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 과일장수 {
    public static void main(String[] args) {
        solution(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1});
    }

    static public int solution(int k, int m, int[] score) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        Arrays.sort(score);

        for (int i = score.length - 1; i >= 0; i--) {
            if (arr.size() < m || i + 1 < m) {
                arr.add(score[i]);

                if (arr.size() == m) {
                    Collections.sort(arr);
                    answer += arr.get(0) * m;

                    arr.clear();
                }
            }
        }

        return answer;
    }
}

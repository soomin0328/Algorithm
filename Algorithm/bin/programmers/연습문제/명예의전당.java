package programmers.연습문제;

import java.util.ArrayList;
import java.util.Collections;

class Solution
{
    public static void main(String[] args) {
        solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
    }

    static public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> aList = new ArrayList<Integer>();

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                aList.add(score[i]);
                Collections.sort(aList);
            }
            if (i >= k) {
                if (aList.get(0) < score[i]) {
                    aList.remove(0);
                    aList.add(0, score[i]);
                    Collections.sort(aList);
                }
            }
            answer[i] = aList.get(0);
        }

        return answer;
    }
}
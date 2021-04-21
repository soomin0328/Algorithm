package programmers.월간코드챌린지_시즌1;

import java.util.ArrayList;

public class 삼진법뒤집기 {
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		System.out.println(solution(45));
	}
	
    public static int solution(int n) {
        int answer = 0;
        
        div(n);
        
        for (int i = 0; i < list.size(); i++)
        {
            answer += list.get(i) * Math.pow(3, list.size() - 1 - i);
        }
        
        return answer;
    }
   
    private static int div(int num) {
        if (num == 0)
            return 0;
        else
        {
            list.add(num % 3);
            return div(num / 3);
        }
    }
}

package programmers.월간코드챌린지_시즌1;

public class 풍선터뜨리기 {
    public int solution(int[] a) {
        int answer = 2;
        int minLeft = 0;
        int minRight = 0;
        
        for (int i = 1; i < a.length - 1; i++) {
        	minLeft = a[0];
        	minRight = a[a.length - 1];
        	
        	for (int j = 0; j < i; j++) {
        		if (a[j] < minLeft) {
					minLeft = a[j];
				}
			}
        	
        	for (int j = i + 1; j < a.length; j++) {
				if (a[j] < minRight) {
					minRight = a[j];
				}
			}
        	
        	if (a[i] < minLeft || a[i] < minRight) {
				answer++;
			}
		}
        
        return answer;
    }
}

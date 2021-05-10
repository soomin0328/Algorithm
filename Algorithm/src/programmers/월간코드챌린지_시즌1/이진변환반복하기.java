package programmers.월간코드챌린지_시즌1;

public class 이진변환반복하기 {
	static int zeroCnt = 0;
	static int conversionCnt = 0;
	
	public static void main(String[] args) {
		solution("1111111");
	}
	
    public static int[] solution(String s) {
        int[] answer = new int[2];
        
        conversion(s);
        
        answer[0] = conversionCnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
    
    private static void conversion(String str) {
    	String newStr = "";
    	String[] strArr = str.split("");
    	
    	for (String splitStr : strArr) {
			if (splitStr.equals("0")) {
				zeroCnt++;
			}
		}
    	
    	newStr = Integer.toBinaryString(str.replaceAll("0", "").length());
    	conversionCnt++;
    	
    	if (!newStr.equals("1")) {
			conversion(newStr);
		} else {
			return;
		}
	}
}

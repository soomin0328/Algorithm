public class JadenCase문자열만들기 {
    public static void main(String[] args) {
        solution("3people unFollowed me");
    }
    
    public static String solution(String s) {
        String[] strArr = s.toLowerCase().split("");
        String answer = strArr[0].toUpperCase();

        for (int i = 1; i < strArr.length; i++) {
            if (strArr[i - 1].equals(" ")) {
                strArr[i] = strArr[i].toUpperCase();
            }
            answer += strArr[i];
        }
        return answer;
    }
}

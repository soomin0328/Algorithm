public class 옹알이2 {

    public static void main(String[] args) {
        solution(new String[]{"aya", "yee", "u", "maa"});
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] strArr = {"aya", "ye", "woo", "ma"};

        for (String babblString : babbling) {

            for (int i = 0; i < strArr.length; i++) {
                babblString = babblString.replaceAll(strArr[i], String.valueOf(i));
            }

            char[] charArr = babblString.toCharArray();
            boolean flag = true;
            char preChar = ' ';
            
            for (int i = 0; i < charArr.length; i++) {
                if (!Character.isDigit(charArr[i]) || preChar == charArr[i]) {
                    flag = false;
                    break;
                }
                preChar = charArr[i];
            }

            if (flag) {
                answer++;
            }
        }

        return answer;
    }
}

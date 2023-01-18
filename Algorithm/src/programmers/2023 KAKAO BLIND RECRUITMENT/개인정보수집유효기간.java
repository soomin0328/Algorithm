import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 개인정보수집유효기간 {
    public static void main(String[] args) throws ParseException {
        solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }

    public static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};
        Map<String, Integer> privacyMap = new HashMap<>();
        List<Integer> answerList = new ArrayList<>();

        for (String str : terms) {
            privacyMap.put(str.split(" ")[0], Integer.parseInt(str.split(" ")[1]));
        }
        
        for (int i = 0; i < privacies.length; i++) {
            String privacyType = privacies[i].split(" ")[1];

            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
            Calendar cal = Calendar.getInstance();

            Date startDate = format.parse(privacies[i].split(" ")[0]);
            cal.setTime(startDate);
            cal.add(Calendar.MONTH, privacyMap.get(privacyType));
            cal.add(Calendar.DATE, -1);
            
            
            if (cal.get(Calendar.DATE) > 28) {
                cal.set(Calendar.DATE, 28);
            }
            
            Date endDate = cal.getTime();
            Date nowDate = format.parse(today);

            if (nowDate.compareTo(endDate) > 0) {
                answerList.add(i + 1);
            }
        }

        answer = new int[answerList.size()];
        Collections.sort(answerList);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}

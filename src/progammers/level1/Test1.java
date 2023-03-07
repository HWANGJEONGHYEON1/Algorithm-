package progammers.level1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String today = new String("2022.05.19");
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(new Test1().solution(today, terms, privacies));
    }

    public int[] solution(String today, String[] terms, String[] privacies) {

        LocalDate todayDate = dayConvert(today);
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] split = term.split(" ");
            map.put(split[0], Integer.parseInt(split[1]));
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] split = privacies[i].split(" ");
            LocalDate joinDate = dayConvert(split[0]);
            String person = split[1];
            LocalDate localDate = joinDate.plusMonths(map.get(person));
            if (todayDate.isAfter(localDate) || todayDate.isEqual(localDate)) {
                list.add(i+1);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    private LocalDate dayConvert(String today) {
        String[] split = today.split("\\.");
        return LocalDate.of(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
    }
}

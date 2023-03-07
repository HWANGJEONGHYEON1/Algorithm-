package progammers.level1;

import java.util.*;

// 신고결과받기
public class Test14 {

    public static void main(String[] args) {
        new Test14().solution(new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi", "muzi frodo"}, 2);
    }

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> set = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> reportedIdList = new HashMap<>();
        Map<String, String> reportIdList = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();

        for (String reportString : set) {
            String[] split = reportString.split(" ");
            reportedIdList.put(split[1], reportedIdList.getOrDefault(split[1], 0) + 1);
            reportIdList.put(split[0], reportIdList.getOrDefault(split[0], "") + split[1] + " ");
        }

        for (String id : reportIdList.keySet()) {
            for (String s : reportIdList.get(id).split(" ")) {
                if (reportedIdList.get(s) >= k && !s.equals(" ")) {
                    result.put(id, result.getOrDefault(id, 0) + 1);
                }
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            answer[i] = result.get(id_list[i]) != null ? result.get(id_list[i]) : 0;
        }

        return answer;
    }
}

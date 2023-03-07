package progammers.level1;

import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        new Test25().solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}); // 3 4 2 1 5
        System.out.println();
        new Test25().solution(4, new int[] {4,4,4,4,4}); // 4 1 2 3
        new Test25().solution(5, new int[] {1,2,2,1,3}); // 4 1 2 3
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] stageCount = new int [N];
        Map<Integer, Double> failMap = new HashMap<>();
        double n = stages.length;


        for (int i = 0; i < stages.length; i++) {
            if (stages[i] == N + 1) {
                continue;
            }

            stageCount[stages[i] - 1]++;
        }

        for (int i = 0; i < stageCount.length; i++) {
            if (n == 0) {
                failMap.put(i, 0d);
                continue;
            }

            failMap.put(i, stageCount[i] / n);
            n -= stageCount[i];
        }


        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;

            for (Integer key : failMap.keySet()) {
                if (max < failMap.get(key)) {
                    max = failMap.get((key));
                    maxKey = key;
                }
            }
            answer[i] = maxKey + 1;
            failMap.remove(maxKey);
        }

        return answer;
    }
}

package progammers.level1;

import java.util.*;

// 로또의 최고 순위와 최저순위
public class Test19 {

    public static void main(String[] args) {
        System.out.println(new Test19().solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19}));
        System.out.println(new Test19().solution(new int[] {0, 0, 0, 0, 0, 0}, new int[] {31, 10, 45, 1, 6, 19}));
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 6);
        map.put(1, 6);
        map.put(2, 5);
        map.put(3, 4);
        map.put(4, 3);
        map.put(5, 2);
        map.put(6, 1);

        for (int i : lottos) {
            if (i == 0) {
                count++;
            }
        }
        int[] successArr = Arrays.stream(win_nums)
                .filter(w -> Arrays.stream(lottos)
                        .anyMatch(lo -> lo == w)
                ).toArray();

        int min = successArr.length;
        int max = min + count;
        answer[0] = map.get(max);
        answer[1] = map.get(min);

        return answer;
    }
}

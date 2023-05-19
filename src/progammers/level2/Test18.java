package progammers.level2;


import java.util.*;

// 귤 고르기
public class Test18 {
    public static void main(String[] args) {
        new Test18().solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3}); // 3
        new Test18().solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3}); // 1
    }

    public int solution(int k, int[] tangerine) {
        // 경화가 한 상자에 담으려는 귤의 개수 k와 귤의 크기를 담은 배열 tangerine이 매개변수로 주어집니다. 경화가 귤 k개를 고를 때 크기가 서로 다른 종류의 수의 최솟값을 return 하도록 solution 함수를 작성해주세요.
        int answer = 0;
        Arrays.sort(tangerine);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        list.sort((o1, o2) -> map.get(o2) - map.get(o1));

        int count = 0;
        for (Integer integer : list) {
            Integer size = map.get(integer);
            count += size;
            answer++;
            if (count >= k) {
                break;
            }
        }

        System.out.println(answer);
        return answer;
    }
}

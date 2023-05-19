package progammers.level2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 마법의 엘레베이터
public class Test16 {

    public static void main(String[] args) {
        System.out.println(new Test16().solution1(16));
        System.out.println(new Test16().solution1(2554));
        System.out.println(new Test16().solution1(661));
    }

    public int solution1(int storey) {
        List<Integer> collect = Arrays.stream(String.valueOf(storey).split(""))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        int answer = 0;
        // 5 보다 크면 더하고 다음 자리수에 + 1
        // 5 라면? 다음 자리수가 5보다 큰지 작은지 판단

        for (int i = collect.size() - 1; i >= 0; i--) {
            if (collect.get(i) > 5) {
                answer += 10 - collect.get(i);

                if (i == 0) {
                    answer++;
                } else {
                    collect.add(i-1, collect.get(i - 1) + 1);
                }
            } else {
                answer += collect.get(i);
            }
        }
        return answer;
    }
    // 2554
    // -1, +100이 적힌 버튼을 4번, +10이 적힌 버튼을 5번, -1000이 적힌 버튼을 3번 누르면 0층에 도착 할 수 있습니다. 그러므로 16을 return 합니다.
    public int solution(int storey) {
        String s = Integer.toString(storey);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }

        int answer = 0;

        // 6 6 1
        //
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 5) {
                answer += 10 - arr[i];

                if (i == 0) {
                    answer++;
                } else {
                    arr[i - 1]++;
                }
            } else if (arr[i] == 5 && i > 0 && arr[i - 1] >= 5) {
                arr[i-1]++;
                answer += 5;
            } else {
                answer += arr[i];
            }
        }

        return answer;
    }
}

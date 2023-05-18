package progammers.level2;

import java.util.Arrays;

// 마법의 엘레베이터
public class Test16 {

    public static void main(String[] args) {
        System.out.println(new Test16().solution(16));
        System.out.println(new Test16().solution(2554));
        System.out.println(new Test16().solution(661));
    }

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

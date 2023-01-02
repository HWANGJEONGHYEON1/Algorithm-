package test.test03;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Test5 {

    /**
     * 0과 1로 구성된 길이가 N인 수열이 주어집니다.
     * 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요.
     *
     * 만약 길이가 길이가 14인 다음과 같은 수열이 주어지고 k=2라면
     *
     * 1 1 0 0 1 1 0 1 1 0 1 1 0 1
     *
     * 여러분이 만들 수 있는 1이 연속된 연속부분수열은
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(solution());
        System.out.println(solution1());
    }

    private static int solution1() {
        int answer = 0;
        int k = 2;
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        int count = 0;
        int lt = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            if (arr[rt] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[lt++] == 0) {
                    count--;
                }
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    private static int solution() {
        int answer = 0;
        int[] arr = {1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1};
        int k = 2;
        int lt = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }

            while (count > k) {
                if (arr[lt] == 0) {
                    count--;
                }
                lt++;
            }
            answer = Math.max(answer, i - lt + 1);
        }

        return answer;
    }
}

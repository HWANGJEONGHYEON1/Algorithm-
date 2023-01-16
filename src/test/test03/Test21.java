package test.test03;

import java.util.Arrays;
import java.util.Stack;

/**
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 *
 * 정렬하는 방법은 선택정렬입니다.
 6
 13 5 11 7 23 15
 */
public class Test21 {

    public static void main(String[] args) {
        System.out.println(solution(5)); // 7 5 3 2 6
    }


    private static int[] solution(int n) {
        int[] cache = new int[n];
        int[] arr = {1, 2, 3, 2, 6, 2, 3, 5, 7};
        for (int inputCache : arr) {
            int pos = - 1;

            for (int i = 0; i < n; i++) {
                if (cache[i] == inputCache) {
                    pos = i;
                }
            }
            if (pos == -1) {
                for (int i = n - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = inputCache;
        }
        System.out.println(Arrays.toString(cache));
        return cache;
    }
}

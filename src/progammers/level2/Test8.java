package progammers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//연속된 부분 수열의 합
public class Test8 {


    public static void main(String[] args) {

        // 기존 수열에서 임의의 두 인덱스의 원소와 그 사이의 원소를 모두 포함하는 부분 수열이어야 합니다.
        // 부분 수열의 합은 k입니다.
        // 합이 k인 부분 수열이 여러 개인 경우 길이가 짧은 수열을 찾습니다.
        // 길이가 짧은 수열이 여러 개인 경우 앞쪽(시작 인덱스가 작은)에 나오는 수열을 찾습니다.
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {1, 1, 1, 2, 3, 4, 5};
        int[] arr = {2, 2, 2, 2, 2};
        int k  = 6;
        System.out.println(Arrays.toString(solution(arr, k)));
        // 1. 인덱스 길이가 가장 작은 것
        // 작은 것 부터 큰 순

    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int left = 0;
        int right = 0;
        int sum = 0;
        int len = 1000001;

        while (true) {
            if (sum < k) {
                sum += sequence[right++];
            } else if (right >= sequence.length) {
                break;
            } else {
                sum -= sequence[left++];
            }

            if (sum == k) {
                if (right - left < len) {
                    answer[0] = left;
                    answer[1] = right - 1;
                    return answer;
                }
            }
        }

        return answer;
    }
}

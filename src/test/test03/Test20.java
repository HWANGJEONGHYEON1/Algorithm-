package test.test03;

import java.util.Arrays;

/**
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 *
 * 정렬하는 방법은 선택정렬입니다.
 6
 13 5 11 7 23 15
 */
public class Test20 {

    public static void main(String[] args) {
        System.out.println(solution(5)); // 3
    }


    private static int[] solution(int n) {
        int[] answer = new int[n];
        int[] arr = {13, 5, 11, 7, 23, 15};


        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > target) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j+1] = target;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

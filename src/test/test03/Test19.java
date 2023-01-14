package test.test03;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 *
 * 정렬하는 방법은 선택정렬입니다.
 6
 13 5 11 7 23 15
 */
public class Test19 {

    public static void main(String[] args) {
        System.out.println(solution(5)); // 3
    }


    private static int[] solution(int n) {
        int[] answer = new int[n];
        int[] arr = {13, 5, 11, 7, 23, 15};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

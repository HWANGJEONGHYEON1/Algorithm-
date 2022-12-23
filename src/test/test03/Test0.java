package test.test03;

import java.util.Scanner;

public class Test0 {
    public static void main(String[] args) {

        System.out.println(solution(3));
    }

    private static int solution(int n) {
        int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        for (int rt = n; rt < arr.length; rt++) {
            sum = Math.max(sum + arr[rt] - arr[rt - n], sum);
        }


        return sum;
    }
}

package progammers.level2;

import java.util.Arrays;

public class Test4 {

    public static void main(String[] args) {
        new Test4().solution(
                new int[][] {
                        {1 ,4}, // 0 1
                        {3, 2},
                        {4, 1}},
                new int[][] {
                        {3, 3},
                        {3, 3}}); // 15 15 15 15 15 15
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.println(answer[i][j]);
            }
        }

        // 0,0 * 0,0 + 0,1 * 1,0
        // 0,0 * 0,1 + 0,1 * 1,1
        // 0,0 * 0,2 + 0,1 * 1,2

        // 1,0 * 0,0 + 1,1 * 1,0
        // 1,1 * 0,1 + 1,1 * 1,1


        //(i, k) + (k,j)
        // arr1[i][k] * arr[

        System.out.println(Arrays.toString(answer));
        return answer;
    }
}

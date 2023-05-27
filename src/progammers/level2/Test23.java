package progammers.level2;

import java.util.Arrays;

public class Test23 {

    public static void main(String[] args) {
        System.out.println(new Test23().solution(3, 2, 5));
        System.out.println(new Test23().solution(4, 7, 14));
    }

    public int[] solution(int n, long left, long right) {

        int[] arr = new int[ (int)(right - left) + 1];
        for (int i = 0; i < arr.length; i++) {
            int n1 = (int) left / n + 1;
            int n2 = (int) left % n + 1;
            left++;
            arr[i] = Math.max(n1, n2);
        }

        return arr;
    }

}

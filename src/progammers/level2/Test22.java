package progammers.level2;

import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        System.out.println(new Test22().solution(new int[] {7,9,1,1,4}));
    }

    public int solution(int[] elements) {

        Set<Integer> set = new HashSet<>();

        int start = 1;
        while (start <= elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int sum = 0;
                for (int j = i; j < i + start; j++) {
                    sum += elements[j % elements.length];
                }
                set.add(sum);
            }
            start++;
        }

        return set.size();
    }

    // i = 0, start = 1;
    // j = 0, j < 1, elements[0 % 5], elements[1 % 5], elements[2 % 5], elements[3 % 5], elements[4 % 5]
    // i = 1, start = 2, i = 2, start = 2, i = 3 start = 2, i = 4 start = 2
    // j = 1, j < 3;  elements[1 % 5] + elements[2 % 5], elements[2 % 5] + elements[3 % 5], elements[3 % 5] + elements[4 % 5], elements[4 % 5] + elements[5 % 5]

}

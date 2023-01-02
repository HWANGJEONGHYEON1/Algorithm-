package test.test03;

public class Test3 {
    /**
     * N개의 수로 이루어진 수열이 주어집니다.
     *
     * 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
     *
     * 만약 N=8, M=6이고 수열이 다음과 같다면
     *
     * 1 2 1 3 1 1 1 2
     *
     * 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
     */

    public static int solution() {
        int answer = 0;
        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};
        int specialNumber = 6;
        int lt = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == specialNumber) {
                answer ++;
            }

            while (sum > specialNumber) {
                sum -= arr[lt++];

                if (sum == specialNumber) {
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution());

        int[] arr = {1, 2, 1, 3, 1, 1, 1, 2};
        int m = 6;
        int lt = 0;
        int sum = 0;
        int count = 0;

        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];

            if (sum == m) {
                count++;
            }

            while (sum > m) {
                sum -= arr[lt++];

                if (sum == m) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}

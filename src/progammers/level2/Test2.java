package progammers.level2;

// 숫자의 표현
public class Test2 {

    /**
     * Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.
     *
     * 1 + 2 + 3 + 4 + 5 = 15
     * 4 + 5 + 6 = 15
     * 7 + 8 = 15
     * 15 = 15
     * @param n
     * @return
     */
    public int solution(int n) {
        int answer = 1;
        int num = n / 2 + 1;

        if (n == 2) {
            return 1;
        }

        for (int i = 1; i <= num; i++) {
            int sum = 0;
            int s = i;
            while (sum < n) {
                sum += s++;
                if (sum == n) {
                    answer++;
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Test2().solution(15)); // 4
        System.out.println(new Test2().solution(2)); // 4
        System.out.println(new Test2().solution(1)); // 4
    }
}

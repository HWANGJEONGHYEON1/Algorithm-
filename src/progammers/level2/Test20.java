package progammers.level2;

// 숫자카드 나누기
public class Test20 {

    public static void main(String[] args) {
        System.out.println(new Test20().solution(new int[] {10, 17}, new int[] {5, 20}));; // 0
        System.out.println(new Test20().solution(new int[] {10, 20}, new int[] {5, 17})); // 10
        System.out.println(new Test20().solution(new int[] {14,35,119}, new int[] {18,30,102})); // 7
    }

    // 철수가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고 영희가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a
    // 영희가 가진 카드들에 적힌 모든 숫자를 나눌 수 있고, 철수가 가진 카드들에 적힌 모든 숫자들 중 하나도 나눌 수 없는 양의 정수 a
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;

        int gcdA = arrayA[0];
        int gcdB = arrayB[0];

        for (int i = 1; i <arrayB.length; i++) {
            // 최대 공약수 구하기 arrayA
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }

        boolean isDivideArrayA = isNotDivide(gcdA, arrayB);
        boolean isDivideArrayB = isNotDivide(gcdB, arrayA);

        if (isDivideArrayA) {
            answer = Math.max(answer, gcdA);
        }

        if (isDivideArrayB) {
            answer = Math.max(answer, gcdB);
        }

        return answer;
    }

    private boolean isNotDivide(int gcdNum, int[] array) {
        for (int i : array) {
            if (i % gcdNum == 0) {
                return false;
            }
        }

        return true;
    }

    private int gcd(int n1, int n2) {
        if (n1 % n2 == 0) {
            return n2;
        }

        return gcd(n2, n1 % n2);
    }


}

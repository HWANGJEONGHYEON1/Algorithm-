package progammers.level1;

//콜라
public class Test10 {

    public static void main(String[] args) {
        System.out.println(new Test10().solution(2, 1, 20)); // 19
        System.out.println(new Test10().solution(3, 1, 20)); // 9
    }

    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int p = (n / a) * b;
            int q = (n % a);
            answer += p; // 6 + 2
            n = p + q;
        }
        return answer;
    }
}

package progammers;

// 내적
public class Test21 {

    public static void main(String[] args) {
        new Test21().solution(new int[] {1,2,3,4}, new int[] {-3, -1, 0, 2});
        new Test21().solution(new int[] {-1, 0, 1}, new int[] {1, 0, -1});
    }

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }
        System.out.println(answer);
        return answer;
    }
}

package progammers.level2;

// 점찍기
public class Test19 {

    public static void main(String[] args) {
        System.out.println(new Test19().solution(2, 4)); // 6
        System.out.println(new Test19().solution(1, 5)); // 26
    }


    //  (0, 0), (0, 2), (0, 4), (2, 0), (2, 2), (4, 0)
    public long solution(int k, int d) {
        long answer = 0;
        for (int i = 0; i <= d; i = i + k) {
            int dot = (int) Math.sqrt((long) d * d - (long) i * i);
            answer += (dot / k) + 1;
        }
        return answer;
        // 루트 32
    }
}

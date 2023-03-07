package progammers.level1;

// 기사단원의 무기
public class Test5 {

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int totalNumber = 0;
        int max = 0;

        for (int i = 1; i <= number; i++) {

            int count = getCount(i);
            max = Math.max(max, count);
            if (count <= limit) {
                totalNumber += count;
            } else {
                totalNumber += power;
            }
        }

        return totalNumber;
    }

    public int getCount(int number) {
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (i * i == number) {
                count++;
            } else if (number % i == 0) {
                count += 2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new Test5().solution(5,3,2); // 10
        new Test5().solution(10, 3, 2); // 21
    }
}

package progammers.level1;

// 부족한 금액 계산하기
public class Test17 {

    public static void main(String[] args) {
        System.out.println(new Test17().solution(3, 20, 4)); // 10
    }

    public long solution(int price, int money, int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * price;
        }

        if (sum > money) {
            return sum - money;
        }
        return 0;
    }
}

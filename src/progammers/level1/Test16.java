package progammers.level1;

public class Test16 {

    public static void main(String[] args) {
        System.out.println(new Test16().solution(new int[] {1,2,3,4,6,7,8,0}));
        System.out.println(new Test16().solution(new int[] {5,8,4,0,6,7,9}));
    }

    public int solution(int[] numbers) {

        int sum = 45;
        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }
}

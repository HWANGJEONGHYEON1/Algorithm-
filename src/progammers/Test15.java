package progammers;

import java.util.stream.IntStream;

//나머지가 1이 되는 수 찾기
public class Test15 {
    public static void main(String[] args) {
        System.out.println(new Test15().solution(10));
        System.out.println(new Test15().solution(12));
    }

    public int solution(int n) {

        return IntStream.range(2, n)
                .filter(number -> n % number == 1)
                .findFirst()
                .orElse(0);
    }
}

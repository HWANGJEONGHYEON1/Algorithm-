package reduce;

import java.util.Arrays;

public class ReduceTest {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = Arrays.stream(numbers)
                .reduce(0, (a, b) -> Integer.sum(a, b));

        System.out.println(sum);

        String[] strings = {"a", "b", "c", "d", "e"};
        String reduce = Arrays.stream(strings)
                .reduce("", (a, b) -> a + "|" + b);
        System.out.println(reduce);
    }
}

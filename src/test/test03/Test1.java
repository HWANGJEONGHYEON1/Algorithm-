package test.test03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};

        int[] arr2 = {2,4,6};

        int[] result = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();

        for (int i : result) {
            System.out.print(i + " ");
        }

    }
}

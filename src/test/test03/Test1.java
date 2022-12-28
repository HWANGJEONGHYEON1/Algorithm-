package test.test03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};

        int[] arr2 = {2,4,6,7,9};

        solution(arr1, arr2, 3, 5);
    }

    public static List<Integer> solution(int[] arr1, int[] arr2, int n, int m) {
        List<Integer> list = new ArrayList<>();

        int p1 = 0;
        int p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                list.add(arr1[p1++]);
            } else {
                list.add(arr2[p2++]);
            }
        }

        while (p1 < n) {
            list.add(arr1[p1++]);
        }

        while (p2 < m) {
            list.add(arr2[p2++]);
        }
        System.out.println(list);
        return list;
    }
}

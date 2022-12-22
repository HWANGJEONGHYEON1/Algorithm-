package test.test03;

public class Test2 {
    /**
     *  N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마?
     *  input
     *  10 3
     *  12 15 11 20 25 10 20 19 13 15
     *  output
     *  56
     */

    public static void main(String[] args) {
        int[] arr = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};
        int k = 3;

        int max = 0;
        for (int i = 0; i < arr.length-2; i=i+2) {
            if (max < arr[i] + arr[i+1] + arr[i+2]) {
                max = arr[i] + arr[i+1] + arr[i+2];
            }
        }
        System.out.println(max);
    }
}

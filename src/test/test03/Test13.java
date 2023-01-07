package test.test03;

import java.util.Stack;

// 매출액의 종류
public class Test13 {

    public static void main(String[] args) {
        System.out.println(solution());
    }


    private static int solution() {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int[][] board = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        };

        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        for (int i = 0; i < moves.length; i++) {

            int number = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[j][moves[i] - 1] > 0) {
                    number = board[j][moves[i] - 1];
                    board[j][moves[i] - 1] = 0;
                    if (!stack.isEmpty() && stack.peek() == number) {
                        stack.pop();
                        answer++;
                    } else {
                        stack.push(number);
                    }
                    break;
                }
            }
        }

        return answer * 2;
    }
}

package progammers;

// 행렬의 덧셈
public class Test27 {

    public static void main(String[] args) {
    //[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//        new Test27().solution(
//                new int[][] {{1, 2},
//                            {2, 3}},
//                new int[][] {{3, 4},
//                            {5, 6}});

        new Test27().solution(
                new int[][] {{1},
                        {2}},
                new int[][] {{3},
                        {5}});
    }

    // (0,0) + (0,0),
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr2.length; j++) {
//                int n = arr1[i][j] + arr2[i][j];
//                answer[i][j] = n;
//                System.out.println(n);
//            }
//        }

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}

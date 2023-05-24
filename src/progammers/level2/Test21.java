package progammers.level2;

import java.util.Stack;

// 택배 상자
public class Test21 {

    public static void main(String[] args) {
        System.out.println(new Test21().solution(new int[] {4, 3, 1, 2, 5}));
        System.out.println(new Test21().solution(new int[] {5, 4, 3, 2, 1}));
    }

    public int solution(int[] order) {
        // 택배 기사님이 알려준 순서가 기존의 컨테이너 벨트에 네 번째, 세 번째, 첫 번째, 두 번째, 다섯 번째 놓인 택배상자 순서인 경우, 영재는 우선 첫 번째, 두 번째, 세 번째 상자를 보조 컨테이너 벨트에 보관합니다.
        // 그 후 네 번째 상자를 트럭에 싣고 보조 컨테이너 벨트에서 세 번째 상자 빼서 트럭에싣습니다.
        // 다음으로 첫 번째 상자를 실어야 하지만 보조 컨테이너 벨트에서는 두 번째 상자를, 기존의 컨테이너 벨트에는 다섯 번째 상자를 꺼낼 수 있기 때문에 더이상의 상자는 실을 수 없습니다. 따라서 트럭에는 2개의 상자만 실리게 됩니다.
        int answer = 0;
        int orderIndex = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= order.length; i++) {
            if (order[orderIndex] != i) {
                stack.push(i);
            } else {
                answer++;
                orderIndex++;
            }

            while (!stack.isEmpty() && stack.peek() == order[orderIndex]) {
                answer++;
                orderIndex++;
                stack.pop();
            }
        }

        return answer;
    }
}

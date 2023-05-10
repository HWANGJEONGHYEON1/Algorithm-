package progammers.level2;


import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

// 과제진행하기
public class Test9 {

    // 과제를 받은 루는 다음과 같은 순서대로 과제를 하려고 계획을 세웠습니다.
    //
    //과제는 시작하기로 한 시각이 되면 시작합니다.
    //새로운 과제를 시작할 시각이 되었을 때, 기존에 진행 중이던 과제가 있다면 진행 중이던 과제를 멈추고 새로운 과제를 시작합니다.
    //진행중이던 과제를 끝냈을 때, 잠시 멈춘 과제가 있다면, 멈춰둔 과제를 이어서 진행합니다.
    //만약, 과제를 끝낸 시각에 새로 시작해야 되는 과제와 잠시 멈춰둔 과제가 모두 있다면, 새로 시작해야 하는 과제부터 진행합니다.
    //멈춰둔 과제가 여러 개일 경우, 가장 최근에 멈춘 과제부터 시작합니다.
    //과제 계획을 담은 이차원 문자열 배열 plans가 매개변수로 주어질 때, 과제를 끝낸 순서대로 이름을 배열에 담아 return 하는 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        // [["korean", "11:40", "30"], ["english", "12:10", "20"], ["math", "12:30", "40"]]
        // ["korean", "english", "math"]
//        String[][] plans = {{"korean", "11:40", "30"}, {"english", "12:10", "20"}, {"math", "12:30", "40"}};
        String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
        // ["science", "history", "computer", "music"]
        System.out.println(solution(plans));
    }

    public static List<String> solution(String[][] plans) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        Arrays.sort(plans, Comparator.comparing(p -> LocalTime.parse(p[1], formatter)));

        List<Plan> planList = convertPlans(plans, formatter);
        Stack<Plan> stack = new Stack<>();
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < planList.size(); i++) {
            if (stack.isEmpty()) {
                stack.push(planList.get(i));
                continue;
            }

            Plan nowPlan = stack.peek();
            Plan nextPlan = planList.get(i);

            if (nowPlan.startTime.plusMinutes(Long.parseLong(nowPlan.needTime)).isBefore(nextPlan.startTime)) {
                recursivePop(stack, nextPlan, nowPlan.startTime, answer);
            }
        }

        return answer;
    }

    private static void recursivePop(Stack<Plan> stack, Plan nextPlan, LocalTime startTime, List<String> answer) {
        if (stack.isEmpty()) {
            return ;
        }

        Plan nowPlan = stack.peek();
        if (nowPlan.startTime.plusMinutes(Long.parseLong(nowPlan.needTime)).isBefore(nextPlan.startTime)) {
            answer.add(stack.pop().assignment);
//            recursivePop(stack, nextPlan, startTime.plusMinutes())
        }
    }

    private static List<Plan> convertPlans(String[][] plans, DateTimeFormatter formatter) {
        var planList = new ArrayList<Plan>();

        for (String[] plan : plans) {
            planList.add(new Plan(plan[0], LocalTime.parse(plan[1], formatter), plan[2]));
        }

        return planList;
    }

    private static class Plan {
        private String assignment;
        private LocalTime startTime;
        private String needTime;

        public Plan(String assignment, LocalTime startTime, String needTime) {
            this.assignment = assignment;
            this.startTime = startTime;
            this.needTime = needTime;
        }

        public void setAssignment(String assignment) {
            this.assignment = assignment;
        }

        public void setStartTime(LocalTime startTime) {
            this.startTime = startTime;
        }

        public void setNeedTime(String needTime) {
            this.needTime = needTime;
        }

    }
}

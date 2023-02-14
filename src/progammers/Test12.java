package progammers;

import java.util.*;
import java.util.stream.Collectors;

// 숫자 짝꿍
public class Test12 {

    public static void main(String[] args) {
        System.out.println(new Test12().solution("100", "2345"));
        System.out.println(new Test12().solution("100", "203045"));
        System.out.println(new Test12().solution("100", "123450"));
        System.out.println(new Test12().solution("12312", "42531"));
        System.out.println(new Test12().solution("5525", "1255"));
    }

    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] x = {0,0,0,0,0,0,0,0,0,0};
        int[] y = {0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<X.length();i++){
            x[X.charAt(i)-48] += 1;
        }
        for(int i=0; i<Y.length();i++){
            y[Y.charAt(i)-48] += 1;
        }

        for(int i=9; i >= 0; i--){
            for(int j=0; j<Math.min(x[i],y[i]); j++){
                answer.append(i);
            }
        }
        if("".equals(answer.toString())){
            return "-1";
        }else if(answer.toString().charAt(0)==48){
            return "0";
        }else {
            return answer.toString();
        }
    }
}
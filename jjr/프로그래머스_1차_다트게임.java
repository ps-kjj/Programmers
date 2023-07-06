package Programmers.jjr;
import java.util.Stack;

public class 프로그래머스_1차_다트게임 {

    class Solution {
        public int solution(String dartResult) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < dartResult.length(); i++){
                char dart = dartResult.charAt(i);
                if(Character.isDigit(dart)){
                    int dartInt = Character.getNumericValue(dart);
                    if(dart == '1' && dartResult.charAt(i+1)=='0'){
                        dartInt = 10;
                        i++;
                    }
                    stack.push(dartInt);
                }
                else{
                    int prevPoint = stack.pop();
                    switch (dart){
                        case 'D':
                            prevPoint = prevPoint*prevPoint;
                            break;
                        case 'T':
                            prevPoint = prevPoint*prevPoint*prevPoint;
                            break;
                        case '*':
                            prevPoint = 2* prevPoint;
                            if(!stack.isEmpty()){
                                stack.push(stack.pop()*2);
                            }
                            break;
                        case '#':
                            prevPoint = prevPoint*(-1);
                            break;
                    }
                    stack.push(prevPoint);
                }
            }
            while(!stack.isEmpty()){
                answer+= stack.pop();
            }
            return answer;
        }
    }
}

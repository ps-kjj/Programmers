package Programmers.jjr;

public class 정수제곱근판별 {
    class Solution {
        public long solution(long n) {
            long answer = -1;
            if(Math.sqrt(n)%1 == 0){
                answer = (long)(Math.sqrt(n)+1);
                return answer*answer ;
            }
            return answer;
        }
    }
}
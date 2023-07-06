package Programmers.jjr;

public class 자연수뒤집어배열로만들기 {

    class Solution {
        public int[] solution(long n) {
                String str = String.valueOf(n);
            String strs[] = str.split("");
            int[] answer = new int[strs.length];
            
            int value = strs.length;
            for(int i = 0; i< strs.length;i++){
                answer[i] = Integer.parseInt(strs[--value]);
            }
            return answer;
        }
    }
}
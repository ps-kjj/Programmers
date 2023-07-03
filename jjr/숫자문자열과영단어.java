package Programmers.jjr;

public class 숫자문자열과영단어 {
    class Solution {
        public int solution(String s) {
            int answer = 0;
            String[][] num = new String[][]{
                { "zero", "one","two","three","four","five","six","seven","eight","nine" },
                {"0", "1","2","3","4","5","6","7","8","9"}
            };
            for(int i =0; i < 10; i++){
                s = s.replace(num[0][i], num[1][i]);
            }
            answer = Integer.parseInt(s);
            return answer;
        }
    }
}

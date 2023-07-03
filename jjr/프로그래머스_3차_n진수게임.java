package Programmers.jjr;

public class 프로그래머스_3차_n진수게임 {
    class Solution {
        public String solution(int n, int t, int m, int p) {
               StringBuilder answer =  new StringBuilder();
               StringBuilder str = new StringBuilder();
       
       
               for (int i = 0; str.length() <= m*t; i++) {
                   str.append(Integer.toString(i, n));
               }
       
               for (int i = p-1; answer.length() < t; i += m) {
                   System.out.println(i);
                   answer.append(str.charAt(i));
               }
       
               return answer.toString().toUpperCase();
           }
       }
}

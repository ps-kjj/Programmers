package Programmers.jjr;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class 모의고사 {

    class Solution {
        public int[] solution(int[] answers) {
            List<Integer> list = new ArrayList<>();
            // 1번 수포자 순서 : 1, 2, 3, 4, 5
            // 2번 수포자 순서 : 2, 1, 2, 3, 2, 4, 2, 5
            // 3번 수포자 순서 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5
            Map<Integer, Integer> sufo = new HashMap<>();

            int[][] nums = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

            int cnt = 0;

            for (int[] num : nums) {
                sufo.put(cnt++, sufo.getOrDefault(cnt, answerCheck(num, answers)));
            }
            int max=0;
            for(int i : sufo.values()){
                if(i > max) max = i;                
            }
            for(int i =0; i < sufo.size(); i++){
                if(sufo.get(i) == max) list.add(i+1);
            }
            int[] answer = new int[list.size()];
            
            for(int i = 0; i < list.size(); i++){
                answer[i] = list.get(i);
            }

            return answer;
        }

        public int answerCheck(int[] num, int[] answers){
            int cut = num.length;
            int cnt = 0;
            for(int i=0; i < answers.length; i++){
                if(answers[i] == num[i%cut]){
                    cnt++;
                }
            }
            
            return cnt;
        }
    }
}

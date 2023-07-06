package Programmers.jjr;
import java.util.*;
import java.util.Map.Entry;
public class 실패율 {
    
    class Solution {
        public int[] solution(int N, int[] stages) {
            int[] answer = new int[N];
            Map<Integer, Double> list = new HashMap<>();

            // 도전자 먼저 구하고
            // 그걸로 나누어야함
            for(int i = 0; i < N; i++){
                int cnt = 0;
                int clear = 0;
                for(int j = 0; j < stages.length; j++){
                    if(stages[j] > i){
                        cnt++;
                        if(stages[j] > i+1){
                            clear++;
                        }
                    }
                }
                
                    list.put(i, (double)clear/cnt);
               
            }
            // Map.Entry 리스트 작성
            List<Entry<Integer, Double>> list_entries = new ArrayList<>(list.entrySet());
            list_entries.sort(Map.Entry.comparingByValue());
            int c = 0;
            for(Map.Entry<Integer, Double> entry : list_entries){
                answer[c++] = entry.getKey()+1;
            }

            return answer;


        }
    }
}

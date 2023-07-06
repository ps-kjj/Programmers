package Programmers.jjr;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map; 
public class 신고결과받기 {
 
    class Solution {
        public int[] solution(String[] id_list, String[] report, int k) {
            int[] answer = new int[id_list.length];
            Map<String, HashSet<String>> reportMap = new HashMap<>();
            Map<String, Integer> answerMap = new HashMap<>();

            // 맵 초기화
            for (String r : id_list) {
                HashSet<String> set = new HashSet<String>();
                reportMap.put(r,set);
                answerMap.put(r, 0);

            }

            // 중복값 없애서 신고한 사람 id를 key로 신고한 id를 values에 넣는다.
            for (String r : report){
                String[] result = r.split("\\s");
                reportMap.get(result[1]).add(result[0]);
            }

            // 신고된 id 카운팅
            for(String s : reportMap.keySet()){

                if( reportMap.get(s).size() >= k ){
                    for(String user : reportMap.get(s)){
                        answerMap.put(user, answerMap.get(user) + 1);
                    }
                }
            }
            
            int cnt = 0;

            for (String s : id_list) {
                answer[cnt++] = answerMap.get(s);
            }
            
            return answer;
        }
 }
}

package Programmers.jjr;
import java.util.HashMap;
public class 완주하지못한선수 {

    class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            HashMap<String, Integer> human = new HashMap<>();
            for(String s : participant){
                human.put(s, human.getOrDefault(s, 0) + 1);
            }
            for(String s : completion){
                human.put(s, human.getOrDefault(s, 0) -1);
            }
            for(String s : participant){
                if(human.get(s) != 0) answer = s;
            }
           
            return answer;
        }
    }
}

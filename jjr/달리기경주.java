package Programmers.jjr;
import java.util.HashMap;
public class 달리기경주 {
    
class Solution {
    public String[] solution(String[] players, String[] callings) {
       String[] answer = new String[players.length];
        
        HashMap<String, Integer> playersMap = new HashMap<>();
        HashMap<Integer, String> rankMap = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            playersMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }




        for (String s : callings) {
             
            int temp = playersMap.get(s)-1;
            String tempPlayer = rankMap.get(temp);
            // 바꾸는 순서
            
            // 앞순서 이름, 순번 저장
            // 앞순서에 현재 바꿔야되는 값 넣기
            // 원래 자리에 앞순서 값넣기
            
            playersMap.put(tempPlayer, temp+1);
            playersMap.put(s, temp);
            
            rankMap.put(temp,  s);
            rankMap.put(temp+1, tempPlayer);

           
            
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = rankMap.get(i);        
        }


        return answer;
    }
}
}

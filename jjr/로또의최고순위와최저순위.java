package Programmers.jjr;

public class 로또의최고순위와최저순위 {
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            
            int cnt = 0;
            int zeroCnt = 0;
            for(int i = 0; i < 6; i++){
                if(lottos[i] == 0)
                    zeroCnt++;
                for(int j = 0; j < 6; j++){
                    if(lottos[i] == win_nums[j]){
                        cnt++;
                    }
                }            
            }        
                
            
            return new int[]{7-Math.max(cnt+zeroCnt,1),7-Math.max(cnt,1)};
        }
    }
}

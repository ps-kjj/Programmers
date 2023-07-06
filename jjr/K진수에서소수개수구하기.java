package Programmers.jjr;

public class K진수에서소수개수구하기 {
    class Solution {
        String str = "";
        public int solution(int n, int k) {
             int answer = 0;
    
            while(n > 0){
                str = (n%k) + str;
                n/=k;
            }
            
            String[] strs = str.split("0");
    
            for (String s : strs) {
                if(s.equals("")) continue;
                if(decimal(Double.valueOf(s))) answer++;
            }
    
    
            return answer;
        }
         boolean decimal(double num) {
            if (num < 2) {
                return false;
            } else if (num == 2) {
                return true;
            } else {
                for(int i = 2; (double)i <= Math.sqrt((double)num); ++i) {
                    if (num % i == 0) {
                        return false;
                    }
                }
    
                return true;
            }
        }
    }
}

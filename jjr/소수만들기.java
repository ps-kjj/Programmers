package Programmers.jjr;

public class 소수만들기 {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("Hello Java");

            for(int i=0; i < nums.length-2; i++){
                for(int j = i + 1; j < nums.length-1; j++){
                    for(int k = j + 1; k < nums.length; k++){
                        if(i == j || j==k || i==k) continue;
                        if(decimal(nums[i]+nums[j]+nums[k])){
                           
                            answer++;
                        }
                    }
                }
            }

            return answer;
        }
        boolean decimal(int num){
            if(num < 2) return false;
            if(num == 2) return true;
            for(int i=2; i<=Math.sqrt((num)); i++){
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}

package Programmers.jjr;
import java.util.HashSet;
public class 소수찾기 {

class Solution {  
    char[] arr;
    HashSet<Integer> set = new HashSet<>();
    boolean[] visited;
    public int solution(String numbers) {
        
       int answer = 0;
            arr = new char[numbers.length()];
            visited = new boolean[numbers.length()];

            for (int i = 0; i < numbers.length(); i++) {
                arr[i] = numbers.charAt(i);
            }
            recursion("", 0);

            for (Integer i : set) {
                System.out.println(i);
                answer++;
            }
        return answer;
    }
    public void recursion(String str, int idx){
            int num;
            if(str!="") {
                num= Integer.parseInt(str);
                if(isPrime(num)) set.add(num);
            }

            if(idx== arr.length) return;

            for(int i=0; i<arr.length; i++){
                if(visited[i]) continue;
                visited[i]= true;
                recursion(str+arr[i], idx+1);
                visited[i]= false;
            }
        }//rec

      public boolean isPrime(int n) {
            if( n <= 1 )
                return false; //1은 소수가 아님.

            // 짝수는 소수에서 제외
            // 단, 2는 유일하게 짝수 중에서 소수
            if( n%2 == 0)
                return n==2 ? true : false;

            // n이 홀수인 경우 sqrt(n)까지 나눠서 나눠떨어지는지 여부 체크
            for(int i=3; i<=Math.sqrt(n); i += 2) {
                // 나눠 떨어진다면 약수에 해당하므로 소수가 아님.
                if( n % i == 0)
                    return false;
            }
            // 위에서 걸러지지 않은 나머지 경우는 소수에 해당됨
            return true;
        }
}
}

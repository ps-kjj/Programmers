package Programmers.jjr;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;

      String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
           answer += Integer.parseInt(String.valueOf(str.charAt(i)));

        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}
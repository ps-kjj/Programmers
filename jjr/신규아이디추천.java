package Programmers.jjr;

public class 신규아이디추천 {
    class Solution {
        public String solution(String new_id) {
                String answer = "";
    
                /**
                 * 규칙에 맞지 않는 아이디를 입력했을때 입력된 아이디와 유사하면서
                 * 규칙에 맞는 아이디를 추천해주는 프로그램을 개발
                  */
    
                /**
                 * 아이디 규칙
                 * 1. 아이디의 길이는 3자 이상 15자 이하여야 함
                 * 2. 아이디는 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표 문자만 사용할 수 있다.
                 * 3. 단, 마침표는 처음과 끝에 사용할 수 없으며 또한 연속으로 사용할 수 없다.
                 */
    
                // 단계별로 진행
    
                // 0단계 new_id 받기
                answer = new_id;
    
                // 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환
                answer = answer.toLowerCase();
                System.out.println("1단계 : " + answer);
    
                // 2단게 new_id에서 알파벳 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
                //
                String match = "[^a-z0-9-_.]";
                answer=answer.replaceAll(match, "");
                System.out.println("2단계 : " + answer);
    
                // 3단계 new_id에서 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
                answer=answer.replaceAll("\\.+", ".");
                System.out.println("3단계 : " + answer);
    
                // 4단계 new_id에서 마침표가 처음이나 끝에 위치한다면 제거함
                answer=answer.replaceAll("^[.]|[.]$", "");
                System.out.println("4단계 : " + answer);
    
                // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
                if(answer.equals("")) answer = "a";
                System.out.println("5단계 : " + answer);
    
                // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
                // 만약 제거 후 마침표가 new_id의 끝 에 위치한다면 끝에 위치한 마침표를 제거
                if(answer.length() > 15) answer=answer.substring(0,15);
                answer=answer.replaceAll("^[.]|[.]$", "");
                System.out.println("6단계 : " + answer);
    
    
                // 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙인다.
                while(answer.length() < 3){
                    answer+=answer.substring(answer.length()-1);
                }
                System.out.println("7단계 : " + answer);
    
                return answer;
           }
    }
}

package Programmers.jjr;

public class 키패드누르기 {
    class Solution {
        int left = 10;
        int right = 12;
    
        public String solution(int[] numbers, String hand) {
            String answer = "";

            /**
             * 이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
             * 맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며, 엄지손가락을 사용하는 규칙은 다음과 같습니다.
             *
             *
             1. 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
             2. 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
             3. 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
             4. 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
             4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.

             1 2 3
             4 5 6
             7 8 9
             * 0 #
             */

            /**
             * 예상 해결 방법 : 현재 양 손가락 위치에서 입력되는 위치 거리 계산해서 가까운쪽으로 클릭하고 옮겨주기
             * 
             */
            
            // 위치 거리 계산
            // 시작위치는 왼손 : * , 오른손 : #  -> 숫자로 변환하면 * = 10, # =  12 3의 배수형태라서 숫자로도 계산이 가능할 듯
            /**
             * 열 확인
             * 3칸이니까 일단 몇번째 열인지 확인
             * 3으로 나누고 남은 값이 1 = 1, 2 = 2, 3 = 0
             * 행 확인
             * 1. 3번째 열 일때는 -3 ~ -5 위로 한칸, +1 ~ +3 아래로 한칸
             * 2. 2번쨰 열 일떄는 -2 ~ -4 위로 한칸, +2 ~ +4 아래로 한칸
             * 3. 1번째 열 일때는 -1 ~ -3 위로 한칸, +3 ~ +5 아래로 한칸

             */
            // 0 치환
            numbers = changeZeroTo(numbers);

            for(int i = 0; i < numbers.length; i++){
                answer += moveHand(numbers[i], hand);
            }
            return answer;
        }

        // 기본 움직임
        public String moveHand(int num, String hand){
            if(cols(num) == 1){
                left=num;
                return "L";
            }else if(cols(num) == 3){
                right=num;
                return "R";
            }else{
                return selectRightAndLeft(num, hand);
            }
        }



        // 0을 11로 치환 (행열 위치를 알기 위함)
        public int[] changeZeroTo(int[] numbers){
            for(int i =0; i < numbers.length; i++){
                numbers[i] = numbers[i] == 0 ? 11 :  numbers[i];
            }
            return numbers;
        }

        // 열 위치 찾기(1, 2, 3)
        public int cols(int num){
            return num = num%3 == 0 ? 3 : num%3;

        }

        // 행 위치 찾기
        public int rows(int num){
            if(num%3 == 0){
                return num/3;
            }else{
                return num/3 + 1;
            }

        }

        // 두개 숫자 사이의 간격
        public int distance(int num1, int num2){
            return Math.abs(cols(num2) - cols(num1)) + Math.abs(rows(num2) - rows(num1));
        }


        // 왼쪽과 오른쪽 어느쪽이 더 가까운지 반환
        public String selectRightAndLeft(int num, String hand){
            if(hand.equals("right")){
                if(distance(num, right) <= distance(num, left)){
                    right = num;
                    return "R";
                }else{
                    left = num;
                    return "L";
                }
            }else{
                if(distance(num, right) >= distance(num, left)){
                    left = num;
                    return "L";
                }else{
                    right = num;
                    return "R";
                }
            }
        }




    }
}

package Programmers.jjr;
import java.util.Stack;
public class 크레인인형뽑기 {
    
    class Solution {
      public int solution(int[][] board, int[] moves) {
            int answer = 0;
            Stack<Integer> basket = new Stack<Integer>();

            for(int i = 0; i < moves.length; i++){
                int doll = drawDoll(board, moves[i]);
                if(doll == 0 ) continue;
                if(basket.isEmpty()){
                    basket.push(doll);
                }
                else{
                    if(basket.peek() == doll){
                        answer+= 2;
                        basket.pop();
                    }else{
                        basket.push(doll);
                    }
                }
            }


            return answer;
        }

        private int drawDoll(int[][] board, int moves){
            int result = 0;
            for(int j = 0; j < board.length; j++){
                if(board[j][moves-1] == 0){
                    continue;
                }else{
                    result = board[j][moves-1];
                    board[j][moves-1] = 0;
                    return result;
                }
            }

            return 0;
        }
}
}

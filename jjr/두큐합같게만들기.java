package Programmers.jjr;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class 두큐합같게만들기 {
   
    class Solution {
        public int solution(int[] queue1, int[] queue2) {
            int count = 0;
            // 큐 생성
            Queue<Integer> q1 = new LinkedList();
            Queue<Integer> q2 = new LinkedList();

            // 큐 초기화
            for (int i = 0; i < queue1.length; i++) {
                q1.add(queue1[i]);
                q2.add(queue2[i]);
            }


            
            // 배열 전체 값 구하기
            long sum1 = Arrays.stream(queue1).sum();
            long sum2 = Arrays.stream(queue2).sum();

            // 목표값
            long target = (sum1 + sum2) / 2;

            while(sum1 != target && sum2 != target){
                if(count > queue1.length*3) return -1;
                if(sum1 > sum2){
                    sum1 -= q1.peek();
                    sum2 += q1.peek();
                    q2.add((q1.poll()));
                    count++;
                } else if(sum2 > sum1){
                    sum2 -= q2.peek();
                    sum1 += q2.peek();
                    q1.add(q2.poll());
                    count++;
                } else{
                    break;
                }

            }
            


            return count;
        }
    }
}

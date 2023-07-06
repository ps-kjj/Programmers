package Programmers.jjr;
import java.util.HashSet;
public class 폰켓몬 {
    
    class Solution {    
        public int solution(int[] nums) {
            HashSet<Integer> numbers = new HashSet<Integer>();
            for (Integer n : nums) {
              numbers.add(n);

           }
            System.out.println(numbers);
            return numbers.size() < nums.length/2 ? numbers.size():nums.length/2;
    }
}
}

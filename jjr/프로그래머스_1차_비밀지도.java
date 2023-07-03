package Programmers.jjr;

public class 프로그래머스_1차_비밀지도 {
    class Solution {
        public String[] solution(int n, int[] arr1, int[] arr2) {
            String[] answer = new String[n];

            for(int i = 0; i < n ; i++){
                String[] binary1 = binaryArray(arr1[i], n);
                String[] binary2 = binaryArray(arr2[i], n);
                String str = "";
                for(int j = 0 ; j < n; j++){
                    if(binary1[j].equals("1") || binary2[j].equals("1")){
                        str += "#";
                    }else{
                        str += " ";
                    }
                }
                answer[i] = str;
            }

            return answer;
        }

        String toIntConvertBinaryString(int num, int n){
            String binary = Integer.toBinaryString(num);
            if(binary.length() == n){
                return binary;
            }
            int cnt = n-binary.length();
            for(int i =0; i < cnt; i++){
                binary = "0" + binary;
            }
            return binary;
        }
        String[] binaryArray(int num, int n){
            return toIntConvertBinaryString(num, n).split("");
        }
    }
}

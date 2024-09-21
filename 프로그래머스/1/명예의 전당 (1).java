import java.util.*;

public class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> resultList = new ArrayList<>();
        int[] answer;
        Queue<Integer> queue = new PriorityQueue<>();
        for(int num : score){
            queue.add(num);
            if(queue.size()>k){
                queue.poll();

            }
            resultList.add(queue.peek());
        }
        answer = new int[resultList.size()];
        for(int i=0; i<resultList.size(); i++){
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}

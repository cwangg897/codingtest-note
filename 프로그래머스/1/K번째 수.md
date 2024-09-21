### 정리
Arrays.copyOfRange가 핵심


```java
import java.util.*;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int i=0; i<commands.length; i++){
            int[] splitArray = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(splitArray);
            int target = splitArray[commands[i][2]-1];
            answer[idx++] = target;
        }
        return answer;
    }
}
```

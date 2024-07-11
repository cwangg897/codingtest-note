### 오답노트
코드 설계 : BFS는 레벨우선탐색이다 그래서 size가 중요하고 level이 중요하다 그 레벨의 큐에있는것만 꺼내서 탐색해야하기 때문이다.

```java
import java.util.*;

public class Main {
    // 첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다. 직선의 좌표 점은 1부터 10,000까지이다.
    static int S;
    static int E;
    static int[] ch = new int[10001];

    static int[] ds = {1, 5, -1};
    public static void bfs(int s){
        Queue<Integer> queue = new LinkedList<>();
        int Level = 0;
        ch[s] = 1;
        queue.add(s);
        while(!queue.isEmpty()){
            int Len = queue.size();
            for(int i=0; i<Len; i++){
                int position = queue.poll();
                if(position == E){
                    System.out.println(Level);
                    return;
                }
                for(int distance = 0; distance< ds.length; distance++){
                    int nx = position+ ds[distance];
                    if(nx>=1 && nx<=10000 && ch[nx] == 0){
                        ch[nx] = 1;
                        queue.offer(nx);
                    }
                }
            }
            Level+=1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextInt();
        E = sc.nextInt();
        bfs(S);
    }
}


```

import java.util.*;

public class Main {
    
    static int[][] direction = {
        // 좌 우 하 상 {x, y}
        {-1, 0}, {1, 0}, {0, -1}, {0, 1}
    };
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = Integer.valueOf(in.nextLine());

        int[][] map = new int[N][N];
        int maxHeight = 0;
        for(int i = 0; i < N; i++) {
            String[] s = in.nextLine().split(" ");
            for(int j = 0; j < N; j++) {
                int v = Integer.valueOf(s[j]);
                map[i][j] = v;
                maxHeight = Math.max(maxHeight, v);
            }
        }
        
        int result = 1;
        for(int limit = 1; limit <= maxHeight; limit++) {
            boolean[][] visited = new boolean[N][N];
            int count = 0;
            
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(map[i][j] > limit && !visited[i][j]) {
                        count += 1;
                        bfs(limit, map, visited, i, j);
                    }
                }
            }
            
            result = Math.max(result, count);
        }
        
        System.out.println(result);
    }
    
    public static void bfs(int limit, int[][] map, boolean[][] visited, int x, int y) {
        visited[x][y] = true;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            
            for(int i = 0; i < direction.length; i++) {
                int nX = cur[0] + direction[i][0];
                int nY = cur[1] + direction[i][1];
                
                if(nX >= 0 && nY >= 0 && nX < map.length && nY < map.length
                          && map[nX][nY] > limit && !visited[nX][nY]) {
                    queue.add(new int[] {nX, nY});
                    visited[nX][nY] = true;
                }
            }
        }
    }
}
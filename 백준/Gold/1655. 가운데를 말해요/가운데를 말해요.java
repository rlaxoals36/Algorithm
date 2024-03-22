import java.util.*;
import java.io.*;

public class Main{
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> min = new PriorityQueue<>();  // A
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());  // B
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            
            if(max.size() == min.size()) {   // 데이터 삽입할 때 max -> min 을 반복
                max.offer(x);
            } else {
                min. offer(x);
            }
            
            if(!min.isEmpty() && max.peek() > min.peek()) {  //  A 집합의 최댓값이 B 집합의 최솟값보다 큰 경우
                int tmp = min.poll();
                min.offer(max.poll());
                max.offer(tmp);
            }
            
            sb.append(max.peek() + "\n");
        }
        System.out.println(sb);
    }
}
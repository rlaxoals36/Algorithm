import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // 트리의 노드 갯수(완전 이진 트리이기 때문에) -> 2^k - 1
        int K = (int) Math.pow(2, in.nextInt()) - 1;
        
        // inorder(중위 탐색) 결과로 방문한 노드
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < K; i++) {
            list.add(in.nextInt());
        }
        
        Node root = Main.buildTree(list, 0, list.size() - 1);
        printTree(root);
    }
    
    static class Node {
        int data;
        Node left;
        Node right;
        
        Node(int data) { this.data = data; }
    }
    
    static Node buildTree(List<Integer> inorder, int start, int end) {
        
        if(start > end) {   // 재귀함수가 무한호출 되는걸 막기 위한 종료 조건
            return null;
        }        
        
        int i = (start + end) / 2;
        Node node = new Node(inorder.get(i));  // root node
        
        if(start == end) {  // leaf nood
            return node;
        }
        
        node.left = buildTree(inorder, start, i - 1);
        node.right = buildTree(inorder, i + 1, end);
        return node;
    }
    
    static void printTree(Node root) {
        
        StringBuilder sb = new StringBuilder();
        
        Queue<Node> queue = new LinkedList<>();  // 트리를 출력하기 위해 큐를 사용
        queue.add(root);
        
        while(!queue.isEmpty()) {  // 큐가 빌 때까지 출력
            int n = queue.size();
            for(int i = 0; i < n; i++) {  // 각 레벨별로 sb에 append
                Node node =queue.poll();
                sb.append(node.data + " ");
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            } 
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
    
}
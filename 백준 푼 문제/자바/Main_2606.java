package 자바;

import java.io.*;
import java.util.*;

public class Main_2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        Map<Integer, List<Integer>> map = new HashMap<>();

        // 맵 초기화
        for (int i=1; i<=N; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int i=0; i<M; i++) {
            int[] inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            // 양방향으로 넣기
            map.get(inputArr[0]).add(inputArr[1]);
            map.get(inputArr[1]).add(inputArr[0]);
        }

        // 1 : [2, 5]
        // 2 : [1, 3, 5]
        // 3 : [2]
        // 4 : [7]
        // 5 : [1, 2, 6]
        // 6 : [5]
        // 7 : [4]

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1); // 1번은 이미 감염
        int infectedCount = 0; // 1번은 감염 카운트에 넣지 않으므로 0부터 시작

        // 해당 노드가 감염되었는지를 표시하는 boolean 배열
        boolean[] infected = new boolean[N+1];
        infected[1] = true;

        while (queue.size() != 0) {
            int node = queue.poll(); // 큐에서 노드를 꺼내고
            for (int i : map.get(node)) { // 그 노드와 연결되어 있는 노드들을 탐색
                if (infected[i] == false) { // 연결 노드가 감염되지 않았으면
                    queue.add(i); // 큐에 추가
                    infected[i] = true; // 감염시키기
                    infectedCount += 1;
                }
            }
        }
        System.out.println(infectedCount);
    }
}

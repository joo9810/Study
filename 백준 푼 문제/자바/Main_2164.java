package 자바;

import java.io.*;
import java.util.*;

public class Main_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 큐(Queue)
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            queue.add(i);
        }

        int temp;
        while (queue.size() > 1) {
            // 젤 위에 카드 버리기
            queue.poll();

            // 젤 위에 카드를 젤 아래로 옮기기
            temp = queue.poll();
            queue.add(temp);
        }
        System.out.println(queue.poll());
    }
}

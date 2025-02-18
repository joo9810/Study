package 자바;

import java.io.*;
import java.util.*;

public class Main_21736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] graph = new char[N][M];
        boolean[][] visited = new boolean[N][M];
        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<N;i ++) {
            String inputStr = br.readLine();
            for (int j=0; j<M; j++) {
                char currentChar = inputStr.charAt(j);
                graph[i][j] = currentChar;
                if (currentChar == 'I') {
                    visited[i][j] = true;
                    queue.add(i);
                    queue.add(j);
                }
            }
        }

        // 탐색
        int count = 0;
        while (!queue.isEmpty()) {
            int currentX = queue.poll();
            int currentY = queue.poll();

            int[] X = {-1, 1, 0, 0};
            int[] Y = {0, 0, 1, -1};
            for (int i=0; i<4; i++) {
                int newX = currentX + X[i];
                int newY = currentY + Y[i];
                if (newX >= 0 && newY >= 0 && newX < N && newY < M) {
                    if (visited[newX][newY] == false) {
                        visited[newX][newY] = true;
                        if (graph[newX][newY] != 'X') { // O or P
                            queue.add(newX);
                            queue.add(newY);
                            if (graph[newX][newY] == 'P') {
                                count += 1;
                            }
                        }
                    }
                }
            }
        }
        if (count != 0) {
            System.out.println(count);
        } else {
            System.out.println("TT");
        }
    }
}
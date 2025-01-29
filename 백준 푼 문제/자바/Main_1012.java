package 자바;

import java.io.*;
import java.util.*;

public class Main_1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int a = 0; a<T; a++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] filed = new int[M][N];
            boolean[][] visited = new boolean[M][N];

            List<int[]> cabbageList = new ArrayList<>();
    
            for (int i=0; i<K; i++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
    
                filed[X][Y] = 1; // 배추가 심어진 걸 표시
                
                cabbageList.add(new int[]{X, Y}); // 배추 위치를 담은 리스트
            }

            int area = 0;

            // 상하좌우 좌표
            int[] dx = {0, 0, 1, -1};
            int[] dy = {1, -1, 0, 0};
    
            for (int[] p : cabbageList) {

                int startX = p[0];
                int startY = p[1];
                
                if (visited[startX][startY] == false) { // 방문하지 않았으면 탐색 시작
                    area += 1;
                    Queue<int[]> queue = new LinkedList<>(); // 같은 영역의 배추 좌표를 담을 큐
                    queue.add(new int[] {startX, startY}); // 큐에 담고
                    visited[startX][startY] = true; // 방문 표시

                    while (queue.size() != 0) { // 큐에 좌표가 담겨 있을 때 실행

                        int[] pollArr = queue.poll();
                        int x = pollArr[0];
                        int y = pollArr[1];

                        for (int i=0; i<4; i++) { // 4회 반복
                            int nx = x + dx[i];
                            int ny = y + dy[i];
                            if (nx >= 0 && ny >= 0 && nx < M && ny < N) {
                                if (filed[nx][ny] == 1 && visited[nx][ny] == false) { // 배추가 있으면서 탐색 안했으면
                                    queue.add(new int[] {nx, ny}); // 큐에 담기
                                    visited[nx][ny] = true;
                                }
                            }
                        }
                    }
                }
            }
            bw.write(area + "\n");
        }
        bw.flush();
        bw.close();
    }
}

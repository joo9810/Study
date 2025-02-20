package 자바;

import java.io.*;
import java.util.*;

public class Main_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if (num == 1 || num == 2) {
                int X = Integer.parseInt(st.nextToken());
                if (num == 1) {
                    deque.addFirst(X);
                } else {
                    deque.addLast(X);
                }
            } else if (num == 3) {
                if (deque.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(deque.pollFirst() + "\n");
                }
            } else if (num == 4) {
                if (deque.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(deque.pollLast() + "\n");
                }
            } else if (num == 5) {
                bw.write(deque.size() + "\n");
            } else if (num == 6) {
                if (deque.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (num == 7) {
                if (deque.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(deque.peekFirst() + "\n");
                }
            } else if (num == 8) {
                if (deque.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(deque.peekLast() + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}

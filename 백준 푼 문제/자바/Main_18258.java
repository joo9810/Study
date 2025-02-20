package 자바;

import java.io.*;
import java.util.*;

public class Main_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operation = st.nextToken();
            if (operation.equals("push")) {
                int num = Integer.parseInt(st.nextToken());
                deque.add(num);
            } else if (operation.equals("pop")) {
                if (deque.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(deque.poll() + "\n");
                }
            } else if (operation.equals("size")) {
                bw.write(deque.size() + "\n");
            } else if (operation.equals("empty")) {
                if (deque.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (operation.equals("front")) {
                if (deque.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(deque.peek() + "\n");
                }
            } else if (operation.equals("back")) {
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
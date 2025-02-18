package 자바;

import java.io.*;
import java.util.*;

public class Main_28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            if (num1 == 1) {
                int num2 = Integer.parseInt(st.nextToken());
                stack.add(num2);
            } else if (num1 == 2) {
                if (stack.isEmpty()) {
                    bw.write(-1 + "\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            } else if (num1 == 3) {
                bw.write(stack.size() + "\n");
            } else if (num1 == 4) {
                if (stack.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (num1 == 5) {
                if (!stack.isEmpty()) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
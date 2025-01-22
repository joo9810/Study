package 자바;

import java.io.*;
import java.util.*;

public class Main_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<N; i++) {
            String[] strArr = br.readLine().split(" ");
            String str = strArr[0];
            int num = str.equals("push") ? Integer.parseInt(strArr[1]) : 0;
            switch (str) {
                case "push":
                    stack.add(num);
                    break;
                case "pop":
                    try {
                        bw.write(stack.pop() + "\n");
                    } catch (Exception e) {
                        bw.write(-1 + "\n");
                    } break;
                case "size":
                    bw.write(stack.size() + "\n");
                    break;
                case "empty":
                    bw.write(((stack.size() == 0) ? 1 : 0) + "\n");
                    break;
                case "top":
                    try {
                        bw.write(stack.peek() + "\n");
                    } catch (Exception e) {
                        bw.write(-1 + "\n");
                    } break;
            }
        }
        bw.flush();
        bw.close();
    }
}

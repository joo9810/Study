package 자바;

import java.io.*;
import java.util.*;

public class Main_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int last = -1;

        for (int i=0; i<N; i++) {
            String[] strArr = br.readLine().split(" ");
            String str = strArr[0];
            int num = str.equals("push") ? Integer.parseInt(strArr[1]) : 0;
            switch (str) {
                case "push":
                    queue.add(num);
                    last = num;
                    break;
                case "pop":
                    bw.write((queue.size() == 0 ? -1 : queue.poll()) + "\n");
                    break;
                case "size":
                    bw.write(queue.size() + "\n");
                    break;
                case "empty":
                    bw.write((queue.size() == 0 ? 1 : 0) + "\n");
                    break;
                case "front":
                    bw.write((queue.size() == 0 ? -1 : queue.peek()) + "\n");
                    break;
                case "back":
                    bw.write((queue.size() == 0 ? -1 : last) + "\n");
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}

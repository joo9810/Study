package 자바;

import java.io.*;
import java.util.*;

public class Main_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = NK[0];
        int K = NK[1];
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=N; i++) {
            queue.add(i);
        }
        bw.write("<");
        int count = 0;
        while (queue.size() > 0) {
            count += 1;
            if (count % K == 0 && queue.size() != 1) {
                bw.write(queue.poll() + ", ");
            } else if (count % K == 0 && queue.size() == 1) {
                bw.write(queue.poll().toString());
            } else {
                queue.add(queue.poll());
            }
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}
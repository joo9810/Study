package 자바;

import java.io.*;
import java.util.*;

public class Main_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            Stack<String> stack = new Stack<>();
            String[] input = br.readLine().split("");
            for (String s : input) {
                try {
                    if (s.equals("(")) {
                        stack.add(s);
                    } else if (s.equals(")") && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.add(s);
                    }
                } catch (Exception e) {
                    stack.add(s);
                }

            }
            if (stack.size() == 0) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
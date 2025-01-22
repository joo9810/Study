package 자바;

import java.io.*;
import java.util.*;

public class Main_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String input = br.readLine();
            if (input.equals(".")) {
                break;
            }

            String[] inputArray = input.split("");
            Stack<String> stack = new Stack<>();
            try {
                for (String s : inputArray) {
                    if (s.equals("(") || s.equals("[")) {
                        stack.add(s);
                    } else if (s.equals(")") && stack.peek().equals("(")) {
                        stack.pop();
                    } else if (s.equals("]") && stack.peek().equals("[")) {
                        stack.pop();
                    } else if (s.equals(")") || s.equals("]")) {
                        stack.add(s);
                    }
                }
            } catch (Exception e) {
                bw.write("no\n");
                continue;
            }

            if (stack.size() == 0) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

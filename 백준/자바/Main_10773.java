package 자바;

import java.io.*;
import java.util.*;

public class Main_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i<K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num != 0) {
                stack.add(num);
            } else {
                stack.pop();
            }
        }
        int total = 0;
        for (int i : stack) {
            total += i;
        }
        System.out.println(total);
    }
}

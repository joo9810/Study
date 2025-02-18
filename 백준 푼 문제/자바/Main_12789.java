package 자바;

import java.io.*;
import java.util.*;

public class Main_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] inputArr = new int[N];
        inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> queue = new LinkedList<>();
        for (int i : inputArr) {
            queue.add(i);
        }

        int num = 1;
        int currentNum;
        Stack<Integer> stack = new Stack<>();
        while (true) {
            if (!queue.isEmpty() && stack.isEmpty()) {
                currentNum = queue.poll();
                if (num == currentNum) {
                    num += 1;
                } else {
                    stack.add(currentNum);
                }
            } else if (!queue.isEmpty() && !stack.isEmpty()) {
                if (queue.peek() == num) {
                    queue.poll();
                    num += 1;
                } else if (stack.peek() == num) {
                    stack.pop();
                    num += 1;
                } else {
                    stack.add(queue.poll());
                }
            } else if (queue.isEmpty() && !stack.isEmpty()) {
                if (stack.peek() == num) {
                    stack.pop();
                    num += 1;
                } else {
                    System.out.println("Sad");
                    break;
                }
            } else {
                System.out.println("Nice");
                break;
            }
        }
    }
}

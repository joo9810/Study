package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n]; // 4 3 6 8 7 5 2 1
        // 입력값 배열에 넣기
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 1~n 숫자가 담긴 스택 생성
        Stack<Integer> stack = new Stack<>(); // 1 2 3 4 5 6 7 8
        for (int i=n; i>=1; i--) {
            stack.add(i);
        }
        // 임시로 수를 담은 스택 생성
        Stack<Integer> tempStack = new Stack<>();
        // push, pop 연산을 담을 큐 생성
        Queue<String> opQueue = new LinkedList<>();

        int currentNumIndex = 0; // 4
        boolean noState = false;
        while (stack.size() > 0 || tempStack.size() > 0) {
            if (stack.size() > 0 && stack.peek() == arr[currentNumIndex]) { // stack의 앞부분이 해당 위치의 수열의 숫자일때
                stack.pop();
                opQueue.add("+"); // push
                opQueue.add("-"); // pop
                currentNumIndex += 1;
            } else { // stack의 앞부분이 해당 위치의 수열의 숫자가 아닐때
                if (tempStack.size() > 0) { // tempStack의 사이즈가 0보다 클때
                    if (tempStack.peek() == arr[currentNumIndex]) { // tempStack의 앞부분이 해당 위치의 수열의 숫자일때
                        tempStack.pop();
                        opQueue.add("-"); // pop
                        currentNumIndex += 1;
                    } else { // tempStack의 앞부분이 해당 위치의 수열의 숫자가 아닐때
                         if (stack.size() > 0) {
                            tempStack.add(stack.pop());
                            opQueue.add("+");
                         } else {
                            bw.write("NO\n");
                            noState = true;
                            break;
                         }
                    }
                } else { // tempStack의 사이즈가 0일때
                    if (stack.size() > 0) {
                        tempStack.add(stack.pop());
                        opQueue.add("+"); // push
                    }
                    else {
                        bw.write("NO\n");
                        noState = true;
                        break;
                    }
                }
            }
        }
        if (noState == false) {
            while(opQueue.size() > 0) {
                bw.write(opQueue.poll() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

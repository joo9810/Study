package 자바;

import java.io.*;
import java.util.*;

public class Main_30804 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] inputArr = new int[N];
        inputArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxLength = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int newStart = 0;
        boolean complete = false;
        Set<Integer> set = new HashSet<>();
        while (true) {
            int start = newStart;
            for (int i=start; i<N; i++) {
                set.add(inputArr[i]);
                if (set.size() > 2) { // set이 3개 이상이거나 i가 마지막까지 갔을때
                    int length = i - start;
                    if (length > maxLength) {
                        maxLength = length;
                        maxStart = start;
                        maxEnd = i-1;
                    }
                    set.clear();
                    break;
                } else if (i == N-1) {
                    int length = i - start + 1;
                    //System.out.println(length);
                    if (length > maxLength) {
                        maxLength = length;
                        maxStart = start;
                        maxEnd = i;
                    }
                    set.clear();
                }

                if (i > 0) {
                    if (i != N-1) {
                        if (inputArr[i] != inputArr[i-1]) {
                            newStart = i;
                            //System.out.println(newStart);
                        }
                    } else {
                        if (inputArr[start] == inputArr[i]) {
                            complete = true;
                        }
                    }
                }
            }

            if (complete) {
                break;
            }
        }
        System.out.println(maxStart + " " + maxEnd);
        System.out.println(maxEnd - maxStart + 1);
    }
}
package 자바;

import java.io.*;
import java.util.*;

public class Main_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++) {
            int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int N = NM[0];
            int M = NM[1];
            int[] intArr = new int[N];
            intArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Queue<Integer> queue = new LinkedList<>();
            for (int j : intArr) {
                queue.add(j);
            }

            // 최대 우선순위 인덱스 파악을 위해 내림차순 정렬 (자바 내림차순 왜 이리 어렵냐..)
            intArr = Arrays.stream(intArr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
            // System.out.println(Arrays.toString(intArr));
            int maxPriority = 0;
            
            int currentIndex = M;
            int outCount = 0;
            while (true) {
                if (queue.peek() == intArr[maxPriority]) { // 큐의 앞부분이 가장 높은 중요도 이면서
                    queue.poll();
                    outCount += 1;
                    if (currentIndex == 0) { // 궁금한 문서라면
                        bw.write(outCount + "\n");
                        break;
                    } else { // 궁금한 문서가 아니라면
                        currentIndex -= 1;
                        maxPriority += 1;
                    }
                } else { // 큐의 앞부분이 가장 높은 중요도가 아니면서
                    queue.add(queue.poll());
                    if (currentIndex != 0) { // 궁금한 문서가 아니라면
                        currentIndex -= 1;
                    } else { // 궁금한 문서라면
                        currentIndex = queue.size() - 1;
                    }
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
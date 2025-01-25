package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        // 번호가 key인 도감과 이름이 key인 작성
        Map<Integer, String> numMap = new HashMap<>();
        Map<String, Integer> nameMap = new HashMap<>();
        for (int i=1; i<=N; i++) {
            String name = br.readLine();
            numMap.put(i, name);
            nameMap.put(name, i);
        }

        // M개의 문제 맞추기
        for (int i=0; i<M; i++) {
            String qInput = br.readLine();
            try {
                int intInput = Integer.parseInt(qInput);
                bw.write(numMap.get(intInput) + "\n");
            } catch (Exception e) {
                bw.write(nameMap.get(qInput) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}

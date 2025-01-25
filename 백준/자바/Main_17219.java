package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, String> map = new HashMap<>();

        for (int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            String site = input[0];
            String password = input[1];
            map.put(site, password);
        }

        for (int i=0; i<M; i++) {
            String findSite = br.readLine();
            bw.write(map.get(findSite) + "\n");
        }
        bw.flush();
        bw.close();
    }
}

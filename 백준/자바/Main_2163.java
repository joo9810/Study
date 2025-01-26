package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_2163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int result = Math.min((N-1) + N*(M-1), (M-1) + M*(N-1));

        System.out.println(result);
    }
}

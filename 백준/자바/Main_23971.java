package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_23971 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int result = (int) Math.ceil((double) H / (N+1)) * (int) Math.ceil((double) W / (M+1));
        System.out.println(result);
    }
}

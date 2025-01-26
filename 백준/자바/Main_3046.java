package 백준.자바;

import java.io.*;
import java.util.*;

public class Main_3046 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        // R2 = 2 * S - R1
        System.out.println(2 * S - R1);
    }
}

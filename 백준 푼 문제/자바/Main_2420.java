package 자바;

import java.io.*;
import java.util.*;

public class Main_2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] NM = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long N = NM[0];
        long M = NM[1];

        System.out.println(Math.abs(N-M));
    } 
}

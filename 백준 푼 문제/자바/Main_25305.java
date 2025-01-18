package 자바;

import java.io.*;
import java.util.*;

public class Main_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = Nk[0];
        int k = Nk[1];

        int[] intArray = new int[N];
        intArray = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        intArray = Arrays.stream(intArray).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();
 
        System.out.println(intArray[k-1]);
    }
}

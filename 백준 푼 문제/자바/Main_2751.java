package 자바;

import java.io.*;
import java.util.*;

public class Main_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] intArray = new int[N];
        for (int i=0; i<N; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }

        Integer[] integerArray = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
        List<Integer> integerList = Arrays.asList(integerArray);

        Collections.sort(integerList);

        for (int i : integerList) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}

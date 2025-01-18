package 자바;

import java.io.*;
import java.util.*;

public class Main_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split("");
        int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();

        intArray = Arrays.stream(intArray).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        StringBuilder sb = new StringBuilder();
        for (int num : intArray) {
            sb.append(num);
        }

        long result = Long.parseLong(sb.toString());
        System.out.println(result);
    }
}

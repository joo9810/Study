package 자바;

import java.io.*;
import java.util.*;

public class Main_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();
        int[] sortedArray = Arrays.stream(intArray).sorted().toArray();
        int[] reverseArray = Arrays.stream(intArray).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray();

        // System.out.println(Arrays.toString(intArray));
        // System.out.println(Arrays.toString(sortedArray));
        // System.out.println(Arrays.toString(reverseArray));

        if (Arrays.equals(intArray, sortedArray)) {
            System.out.println("ascending");
        } else if (Arrays.equals(intArray, reverseArray)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
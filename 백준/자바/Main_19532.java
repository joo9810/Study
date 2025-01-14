package 자바;

import java.io.*;
import java.util.*;

public class Main_19532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringArray = br.readLine().split(" ");
        int[] intArray = Arrays.stream(stringArray).mapToInt(Integer::parseInt).toArray();

        int a = intArray[0];
        int b = intArray[1];
        int c = intArray[2];
        int d = intArray[3];
        int e = intArray[4];
        int f = intArray[5];

        int x = (c*e - b*f) / (a*e - b*d);
        int y = (c*d - a*f) / (b*d - a*e);

        System.out.println(x + " " + y);
    }
}

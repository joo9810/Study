package 자바;

import java.io.*;
import java.util.*;

public class Main_2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] intArray = new int[5];

        for (int i=0; i<5; i++) {
            intArray[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<4; i++) {
            for (int j=0; j<4-i; j++) {
                if (intArray[j] > intArray[j+1]) {
                    int temp = intArray[j+1];
                    intArray[j+1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        System.out.println((int) Arrays.stream(intArray).average().getAsDouble());
        System.out.println(intArray[2]);
    }
}

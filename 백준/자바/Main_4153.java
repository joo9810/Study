package 자바;

import java.io.*;
import java.util.*;

public class Main_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] stringInput = br.readLine().split(" ");
            int[] intInput = Arrays.stream(stringInput).mapToInt(Integer::parseInt).toArray();

            int[] compareArray = {0, 0, 0};

            if (Arrays.equals(intInput, compareArray)) {
                break;
            }

            Arrays.sort(intInput);
    
            int A = intInput[0] * intInput[0] + intInput[1] * intInput[1];
            int B = intInput[2] * intInput[2];
            if (A == B) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    } 
}

package 자바;

import java.io.*;
import java.util.*;

public class Main_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringList = br.readLine().split(" ");
        int[] intList = Arrays.stream(stringList).mapToInt(Integer::parseInt).toArray();
        
        int temp;

        for (int i=0; i<intList.length-1; i++) {
            for (int j=i; j<intList.length-1; j++) {
                if (intList[j] > intList[j+1]) {
                    temp = intList[j+1];
                    intList[j+1] = intList[j];
                    intList[j] = temp;
                }
            }
        }

        if (intList[0] + intList[1] <= intList[2]) {
            intList[2] = intList[0] + intList[1] - 1;
        }

        System.out.println(Arrays.stream(intList).sum());
    }
}

package 자바;

import java.io.*;

public class Main_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[3];
        for (int i=0; i<3; i++) {
            String input = br.readLine();
            try {
                arr[i] = Integer.parseInt(input);
                for (int j=i+1; j<3; j++) {
                    arr[j] = arr[j-1] + 1;
                }
            } catch (Exception e) {

            }
        }
        int result = arr[2] + 1;

        if (result % 3 == 0 && result % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (result % 3 == 0) {
            System.out.println("Fizz");
        } else if (result % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(result);
        }
    }
}

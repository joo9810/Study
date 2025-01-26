package 백준.자바;

import java.io.*;
import java.math.*;

public class Main_2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger A = new BigInteger(br.readLine());
        String operator = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        if (operator.equals("*")) {
            System.out.println(A.multiply(B));
        } else {
            System.out.println(A.add(B));
        }
    }
}

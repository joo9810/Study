package 자바;

import java.io.*;
import java.math.*;

public class Main_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger result = BigInteger.valueOf(1);
        for (int i=n; i>1; i--) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        String stringN = String.valueOf(result);
        String[] stringArray = stringN.split("");
        int count = 0;
        for (int i=stringArray.length-1; i>=0; i--) {
            if (stringArray[i].equals("0")) {
                count += 1;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}

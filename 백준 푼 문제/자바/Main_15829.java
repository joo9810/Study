package 자바;

import java.io.*;
import java.math.*;

public class Main_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String stringInput = br.readLine();
        char[] charInput = new char[L];
        for (int i=0; i<L; i++) {
            charInput[i] = stringInput.charAt(i);
        }
        long r = 31;
        BigInteger M = BigInteger.valueOf(1234567891);

        BigInteger total = BigInteger.valueOf(0);
        // a는 아스키 코드 97번 따라서 96을 빼주면 됨
        for (int i=0; i<L; i++) {
            BigInteger value = BigInteger.valueOf(charInput[i]-96).multiply(BigInteger.valueOf(r).pow(i));
            total = total.add(value);
        }
        BigInteger result = total.mod(M);

        System.out.println(result);
    }
}

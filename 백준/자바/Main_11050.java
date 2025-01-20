package 자바;

import java.io.*;

public class Main_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stringInput = br.readLine().split(" ");
        int N = Integer.parseInt(stringInput[0]);
        int K = Integer.parseInt(stringInput[1]);

        int bunja = 1;
        int bunmo = 1;

        int loopCount = K;
        for (int i=0; i<loopCount; i++) {
            bunja *= N;
            N -= 1;

            bunmo *= K;
            K -= 1;
        }
        
        System.out.println(bunja / bunmo);
    }
}

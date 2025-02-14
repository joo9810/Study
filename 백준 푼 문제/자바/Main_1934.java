package 자바;

import java.io.*;
import java.util.*;

public class Main_1934 {
    public static int euclid(int A, int B) {
        int remainder = A % B;
        if (remainder != 0) {
            return euclid(B, remainder);
        } else {
            return B;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        // 최소 공배수를 찾으려면 최대 공약수를 찾아야 한다
        // 최소 공배수는 A * B / 최대공약수로 구하면 된다
        for (int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(A * B / euclid(A, B) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
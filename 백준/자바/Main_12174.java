package 백준.자바;

import java.io.*;

public class Main_12174 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i=1; i<=T; i++) {
            int B = Integer.parseInt(br.readLine());
            String string = br.readLine();
            char[] charArr = string.toCharArray();
            // OI를 01로 변환
            StringBuilder sb = new StringBuilder(); // "0100111101001011"
            for (char s : charArr) {
                if (s == 'O') {
                    sb.append("0");
                } else {
                    sb.append("1");
                }
            }
            // 8자리마다 끊어서 01을 문자로 변환
            StringBuilder outputString = new StringBuilder();
            for (int j=0; j<B; j++) {
                String charToken = sb.toString().substring(j*8, (j+1)*8); // "01001111"
                char binaryToChar = (char) Integer.parseInt(charToken, 2);
                outputString.append(binaryToChar);
            }
            bw.write("Case #" + i + ": " + outputString.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}

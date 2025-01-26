package 자바;

import java.io.*;

public class Main_2816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        for (int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        int currentIndex = 0;
        while (true) {
            if (arr[currentIndex].equals("KBS1") && currentIndex == 0) {
                currentIndex += 1;
                sb.append("1");
            } else if (arr[currentIndex].equals("KBS2") && currentIndex == 1) {
                if (arr[1].equals("KBS2") && arr[0].equals("KBS1")) {
                    break;
                } else {
                    currentIndex += 1;
                    sb.append("1");
                }
            } else if (arr[currentIndex].equals("KBS1")) {
                String temp = "KBS1";
                arr[currentIndex] = arr[currentIndex-1];
                arr[currentIndex-1] = temp;
                currentIndex -= 1;
                sb.append("4");
            } else if (arr[currentIndex].equals("KBS2")) {
                String temp = "KBS2";
                arr[currentIndex] = arr[currentIndex-1];
                arr[currentIndex-1] = temp;
                currentIndex -= 1;
                sb.append("4");
            } else {
                currentIndex += 1;
                sb.append("1");
            } 
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}

package 자바;

import java.io.*;
import java.text.*;

public class Main_5355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("#.00");
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            String[] inputArr = br.readLine().split(" ");
            double num = Double.parseDouble(inputArr[0]);
            for (int j=1; j<inputArr.length; j++) {
                if (inputArr[j].equals("@")) {
                    num *= 3;
                } else if (inputArr[j].equals("%")) {
                    num += 5;
                } else if (inputArr[j].equals("#")) {
                    num -= 7;
                }
            }
            System.out.println(df.format(num));
        }
    }
}

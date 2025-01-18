package 자바;

import java.io.*;

public class Main_31403 {
    public static void main(String[] arvs) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strA = br.readLine();
        String strB = br.readLine();
        String strC = br.readLine();

        int intA = Integer.parseInt(strA);
        int intB = Integer.parseInt(strB);
        int intC = Integer.parseInt(strC);

        System.out.println(intA + intB - intC);

        System.out.println(Integer.parseInt(strA + strB) - intC);
    }
}

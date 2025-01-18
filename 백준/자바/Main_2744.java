package 자바;

import java.io.*;

public class Main_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder strb = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            char inputChar = input.charAt(i);
            if (Character.isUpperCase(inputChar) == true) {
                char lowerChar = Character.toLowerCase(inputChar);
                strb.append(lowerChar);
            } else {
                char upperChar = Character.toUpperCase(inputChar);
                strb.append(upperChar);
            }
        }
        String result = strb.toString();
        System.out.println(result);
    }   
}

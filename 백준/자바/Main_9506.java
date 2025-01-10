package 자바;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            ArrayList<Integer> divisorList = new ArrayList<>();
            String text = br.readLine();
            int n = Integer.parseInt(text);
            int sum;

            if (n == -1) break;
    
            for (int i=1; i<n; i++) {
                if (n % i == 0) {
                    divisorList.add(i);
                }
            }

            sum = divisorList.stream().mapToInt(Integer::intValue).sum();

            if (sum == n) {
                System.out.print(n + " = ");
                for (int i=0; i<divisorList.size(); i++) {
                    if (i == divisorList.size()-1) {
                        System.out.print(divisorList.get(i) + "\n");
                    } else {
                        System.out.print(divisorList.get(i) + " + ");
                    }
                }
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
    }
}

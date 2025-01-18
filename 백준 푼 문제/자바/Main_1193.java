package 자바;

// 분수찾기

import java.util.Scanner;

public class Main_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = 1;
        int total_block = 1;
        int N = sc.nextInt();
    
        while (true) {
            if (N <= total_block) {
                break;
            }
            line += 1;
            total_block += line;
        }

        int diff = total_block - N;
        int row;
        int col;

        if (line % 2 == 0) {
            row = line - diff;
            col = 1 + diff;
        } else {
            col = line - diff;
            row = 1 + diff;
        }

        System.out.println(row + "/" + col);

        sc.close();
    }
}

















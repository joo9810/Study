package 자바;

// 벌집

import java.util.Scanner;

public class Main_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int room = 1;
        int move = 0;

        while (true) {
            move += 1;
            if (N <= room) {
                break;
            }
            room += move*6;
        }

        System.out.println(move);

        sc.close();
    }
}

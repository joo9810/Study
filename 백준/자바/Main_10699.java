package 자바;

import java.time.LocalDate;
import java.time.ZoneId;

public class Main_10699 {
    public static void main(String[] args) {
        LocalDate seoul = LocalDate.now(ZoneId.of("Asia/Seoul"));

        System.out.println(seoul);
    }
}
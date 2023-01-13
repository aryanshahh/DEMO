package dataandtime;

import java.time.LocalDate;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        LocalDate d= LocalDate.now();
        LocalTime t= LocalTime.now();
        System.out.println(d);
        System.out.println(t);
    }
}

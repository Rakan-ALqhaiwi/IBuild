package com.mycompany.use_the_date_class;

public class Main {

   public static void main(String[] args) {
        DateTester tester = new DateTester();

        long[] times = {
            10000L, 100000L, 1000000L, 10000000L,
            100000000L, 1000000000L, 10000000000L,
            100000000000L
        };

        for (long t : times) {
            tester.testTime(t);
        }
    }
}

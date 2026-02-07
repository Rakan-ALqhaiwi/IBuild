package com.mycompany.use_the_date_class;

import java.util.Date;

public class DateTester {

    private Date date; 

    public DateTester() {
        date = new Date(); 
    }

    public void testTime(long time) {
        date.setTime(time);
        System.out.println("Elapsed time: " + time + " -> " + date.toString());
    }
}

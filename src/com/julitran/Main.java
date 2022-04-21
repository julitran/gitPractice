package com.julitran;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        HashMap <Integer, String> calendar = main.getCalendar();
        System.out.print(calendar.get(1));
    }

    private HashMap <Integer, String> getCalendar() {
        HashMap<Integer, String> calendar = new HashMap<>();
        calendar.put(1, "January");
        calendar.put(2, "February");
        calendar.put(3, "March");
        calendar.put(4444, "March");
        calendar.put(4444, "March");
        calendar.replace(3, "March", "NewMarch");
        calendar.put(4, "April");
        calendar.put(5, "May");
        calendar.put(6, "June");
        calendar.put(7, "July");
        calendar.put(8, "August");
        calendar.put(9, "September");
        calendar.put(10, "Octoberrrrrrr");
        calendar.put(11, "November");
        calendar.put(12, "Decem3434334ber");
        calendar.put(9, "Septe342342mber");
        calendar.put(10, "Octob4324errrrrrr");
        calendar.put(11, "Novem4324ber");
        calendar.put(12, "Dec32432423423423ember");
        calendar.put(12, "Decem3434334ber");
        // my new addition
        return calendar;
    }

}

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
        calendar.put(12, "December");
        calendar.put(13, "add something here so that main is ahead");
        calendar.replace(2, "February", "NewFebruary");
        calendar.put(8434, "random random from Zammy");
        return calendar;
    }

}

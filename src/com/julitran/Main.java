package com.julitran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	 welcomeToMyProgram();
    }

    private static void welcomeToMyProgram() {
        List calendar = new ArrayList();
        calendar.add("January");
        calendar.add("February");
        calendar.add("March");
        calendar.add("April");
        calendar.add("May");
        calendar.add("June");
        calendar.add("July");
        calendar.add("August");
        calendar.add("September");
        calendar.add("October");
        calendar.add("November");
        calendar.add("December");

        calendar.stream().forEach((element) -> System.out.println(element));
    }

}

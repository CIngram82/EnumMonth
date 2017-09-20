package com.example;

import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList futureMonths = new ArrayList();
        Scanner input = new Scanner(System.in);


        Month[] stupidArray = Month.values();

        for (int i = 0; i < stupidArray.length; i++){
            System.out.println((i+1) + " " + stupidArray[i].getEnglishName());
        }
        System.out.println("Please select a month by it's number:");
        int userMonth = input.nextInt();

        switch (userMonth) { // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }
        System.out.println(futureMonths);
    }
}

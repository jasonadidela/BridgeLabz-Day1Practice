//1.7 Write a LeapYear.java program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.
//The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
//So ensure to check for the same. Further, the Leap Year is a Year divisible by 4 and not 100 unless it is divisible by
//400. For e.g. 1800 is not a Leap Year and 2000 is a Leap Year.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Main class");
        System.out.println("Welcome to 1.7_leapYear Branch");
        Scanner a = new Scanner(System.in);
        int year;
        System.out.println("Enter Year");
        year = a.nextInt();
        boolean leap;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leap = year % 400 == 0;
            }
            else
                leap = true;
        }
        else
            leap = false;
        if (leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    }
}
package com.example.enums;

/**
 * @author danieldevlin
 * @date 17/03/2025
 * @project continued-ed
 */
public class DayTest {
    public static void main(String[] args) {
        Day today = Day.MONDAY;

        System.out.println("Today is: " + today);

        // Loop through all enum values
        for (Day d : Day.values()) {
            System.out.println(d);
        }

        System.out.println("Today is: " + today);
        printDayMessage(today);
    }


    public static void printDayMessage(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case FRIDAY:
                System.out.println("Almost the weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend! Relax and enjoy!");
                break;
            default:
                System.out.println("Another regular day of the week.");
                break;
        }
    }
}

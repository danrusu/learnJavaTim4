package com.nagarro.driven.client.rest.assured.impl;

//Assumption: 4 weeks of learning Java Fundamentals
public class JuniorJavaDeveloper {

    static int javaLevel = 0;

    public static void dailyLearning(int hours) {
        javaLevel += hours;
    }

    private static void weeklyLearning() {

        // Monday to Friday, 2hours/day
        for (int i = 0; i < 5; i++) {
            dailyLearning(2);
        }

        // Saturday and Sunday, only courses
        int dayNumber = 6;
        while (dayNumber <= 7) {
            dailyLearning(7);
            dayNumber++;
        }
    }

    public static void main(String[] args) {
        // 4 weeks
        int weekCount=1;
        do{
            weeklyLearning();
            weekCount++;
        } while(weekCount <= 4);

        // you get extra 10 points for every module
        String[] courseModules = new String[]{
                "Data types and variables",
                "Operators and casts",
                "Control Flow",
                "Loops",
                "Arrays",
                "Object-oriented programming",
                "Varargs",
                "Date, time",
                "Regular expressions"};

        System.out.println("This is what we learned in Java Fundamentals module:");

        for(int moduleIndex=0; moduleIndex < 8; moduleIndex++){
            System.out.println(" - " + courseModules[moduleIndex]);
            javaLevel += 10;
        }

        System.out.println("\nFinal scoring: " + JuniorJavaDeveloper.javaLevel);
    }

}

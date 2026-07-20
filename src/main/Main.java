package com.fawry.mcc.intern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = {"Ahmed", "Ali", "Sara", "Mona"};
        int[] grades = {90, 45, 80, 70};

        String result = "";
        // Exception
        try {
            System.out.println("Average = " + calculateAverage(grades));
        } catch (Exception e)
        {
            System.out.println(" exeption index ");
        }


        System.out.println("Highest Grade = " + highestGrade(grades));

        System.out.print("Enter student name: ");

        String input = scanner.nextLine();

        int index = findStudent(names, input);

        if (index != -1) {

            System.out.println(names[index]);

            if (grades[index] >= 50)
               // result.concat("Passed");
               result= result.concat("Passed");
            else
               // result.concat("Failed");
                result= result.concat("Failed");

            System.out.println(result);

        }

        System.out.println(reverseName("Java"));

        int x = 5;

        System.out.println(x++);

        System.out.println(x);

        try {

            int number = Integer.parseInt("ABC");

            System.out.println(number);

        } catch (Exception e) {

        }

        printGrades(grades);

    }

    static double calculateAverage(int[] grades) {

        int sum = 0;

        for (int i = 0; i <= grades.length; i++) {
// for (int i = 0; i < grades.length; i++)
// معملتش الحل دا وعملت Exception

            sum += grades[i];

        }

        return sum / grades.length;

    }

    static int highestGrade(int[] grades) {

        int max = 0;

        for (int i = 0; i < grades.length; i++) {

            if (grades[i] > max)

                max = grades[i];

        }

        return max;

    }

    static int findStudent(String[] names, String name) {

        for (int i = 0; i < names.length; i++) {
            // if (names[i] == name)
            if (names[i].equals(name) )
                return i;

        }

        return -1;

    }

    static String reverseName(String name) {

        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reversed += name.charAt(i);

        }

        return reversed;

    }

    static void printGrades(int[] grades) {

        for (int i = 0; i < grades.length; i++) {

            System.out.println(grades[i] / 10);

        }

    }
}
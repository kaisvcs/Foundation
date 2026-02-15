// Foundation Coding Basics

import java.util.ArrayList;

public class Foundation {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /* Introduction */
        String name = "Kai Saephan Villanueva";
        System.out.println("My name is... " + name);

        /* Variables */ /* 
        int age = 25;                        // integers 
        System.out.println("I am " + age + " years old. and I will be " + (age + 10) + " years old after 10 years.");
        float fee = 99.99f;                     // float (append with f to save space)
        final double PI = 3.1415926;            // final + double
        System.out.println("I owe " + fee + " but not " + PI + " in student fees.");
        final int yearDOB = 2000;               // final (only for numbers)
        System.out.println("I was born in the year... " + yearDOB); */

        /* Data Types */ /* 
        byte humanLife = 100;
        short tenThousands = 32000;
        int mostCommon = 20000000;
        long longBoi = 900000000000000L; // append with L
        float saveSpace = 3.145f;
        double forgetEfficency = 3.14159265358979311599796346854;

        System.out.println(humanLife + " " + tenThousands + " " + mostCommon + " " + longBoi + " " + saveSpace + " " + forgetEfficency); */

        /* Booleans */ /* 
        boolean heads = true;
        boolean tails = false;
        System.out.println("Heads is " + heads + ". Tails is " + tails); */

        /* Char */ /*
        char myGrade = 'B'; // single quotation
        System.out.println("My grade on the exam is a " + myGrade); */

        /* Var */ /* (readability for code)
        ArrayList<String> cars = new ArrayList<String>();
        var cars2 = new ArrayList<String>(); */

        /* Type Casting */ /* 
        double grade = 89.99;
        int roundDown = (int) grade;
        System.out.println(grade + " has been rounded down to " + roundDown);
        int maxScore = 300;
        int userScore = 268;
        double percentage = (double) userScore / maxScore * 100.0d;
        System.out.println(percentage); */

        /* Operators */ /* 
        int x = 1 + 2 - 3 * 4 / 5 % 6;
        System.out.println(x);
        int students = 67;
        int remainder = students % 12;
        System.out.println(remainder);
        int x = 5;
        System.out.println("++ before: "+ ++x);
        int y = 5;
        System.out.println("++ after: "+ y++); */

        /* Strings */ /* 
        String greeting = "Hello there Kai";
        String response = "Hello there Computer...";
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        System.out.println(greeting.indexOf("Kai"));
        System.out.println(greeting.indexOf("Kai"));
        System.out.println(greeting.concat("\n" + response));
        String conversation = greeting.concat("\n" + response);
        System.out.println(conversation); */

        /* Java Math */
        int max = Math.max(6,7);
        System.out.println(max);
        int sqroot = (int)Math.sqrt(144);
        System.out.println(sqroot);
        double abso = Math.abs(-2.5);
        System.out.println(abso);
    }


}
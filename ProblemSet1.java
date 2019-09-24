/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

import java.text.NumberFormat;
import java.lang.Math;

public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Exercise 1.
         *
         * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double length = 11;
         final double width = 8.5;
         final double inchToMM = 645.16;
         final double area = length * width * inchToMM;
         System.out.printf("\n%,.2f %s\n", area, "square millimeters."); //1st "%" formats integer, 2nd "%" formats string

        /*
         * Exercise 2.
         *
         * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
         */

         final double inchToCM = 2.54;
         final double perimeter = ((2 * length) + (2 * width)) * inchToCM;
         System.out.printf("\n%,.2f %s\n", perimeter, "centimeters.");

        /*
         * Exercise 3.
         *
         * What is the length of the diagonal (in inches) between two corners on an 8.5-
         * by-11-inch sheet of paper?
         */

         final double diagonal = Math.hypot(length, width);
         System.out.printf("\n%,.2f %s\n", diagonal, "inches.");

        /*
         * Exercise 4.
         *
         * Given the grading policy and the homework, quiz, and test grades I received,
         * what marking period grade will I get?
         */

         /*
         * Homework = 15%
         * Quizzes = 35%
         * Tests = 50%
         */

         final double hwRate = 0.15;
         final double quizRate = 0.35;
         final double testRate = 0.50;

         int homework1 = 88;
         int homework2 = 91;
         int homework3 = 0;
         int quiz1 = 84;
         int quiz2 = 89;
         int quiz3 = 93;
         int test1 = 74;
         int test2 = 87;
         int test3 = 82;

         double hwTotal = (homework1 + homework2 + homework3) * hwRate;
         double quizTotal = (quiz1 + quiz2 + quiz3) * quizRate;
         double testTotal = (test1 + test2 + test3) * testRate;
         double grade = (hwTotal / 3) + (quizTotal / 3) + (testTotal / 3);
         System.out.printf("\n%,.2f%s\n", grade, "%.");

        /*
         * Exercise 5.
         *
         * I make $12.50/hour working as a cashier at a local supermarket. How much money
         * will I make this week?
         */

         double monday = 7.5;
         double tuesday = 8.0;
         double wednesday = 10.5;
         double thursday = 9.5;
         double friday = 6.0;
         double saturday = 11.5;
         double sunday = 0.0;

         final double hourPay = 12.50;
         double totalHours = monday + tuesday + wednesday + thursday + friday + saturday + sunday;
         double totalPay = totalHours * hourPay;
         NumberFormat currencyformat = NumberFormat.getCurrencyInstance();
         System.out.println("\n" + currencyformat.format(totalPay) + ".");

        /*
         * Exercise 6.
         *
         * What is my take-home pay each check?
         */

         final double salary = 117000;
         double payPeriod = salary / 24;

         final double preTax401k = 0.07; //Deducted before tax
         double taxedPay = payPeriod * (1 - preTax401k);

         final double fedTax = 0.240;
         double fedTaxedPay = taxedPay * (1 - fedTax);

         final double stateTax = 0.0637;
         double takeHomePay = fedTaxedPay * (1 - stateTax);

         System.out.println("\n" + currencyformat.format(takeHomePay) + ".");


        /*
         * Exercise 7.
         *
         * I am planning a class trip next month. How many buses do I need, and how many
         * people will be on the last bus?
         */

         final double students = 273;
         final double teachers = 28;
         final double busCap = 54;
         double totalPassengers = students + teachers;
         double busNo = Math.ceil(totalPassengers / busCap);
         double remainder = totalPassengers % busCap;

         System.out.printf("\n%.0f %s %.0f %s\n", busNo, "buses are needed, with", remainder, "passengers on the last bus.");

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */

         final double cornholeLength = 48;
         final double cornholeWidth = 24;
         final double cornholeDiameter = 6;
         double cornholeRadius = cornholeDiameter / 2;
         double circleArea = Math.PI * cornholeRadius * cornholeRadius;
         double cornholeArea = (cornholeLength * cornholeWidth) - circleArea;

         System.out.printf("\n%,.2f %s\n", cornholeArea, "square inches.");

        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */

         int year = 2020;
         boolean leapTest = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
         System.out.println("\n" + year + " is a leap year..." + leapTest + ".");

         year = 2100;
         leapTest = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
         System.out.println(year + " is a leap year..." + leapTest + ".");

         year = 2400;
         leapTest = (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
         System.out.println(year + " is a leap year..." + leapTest + ".");

        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */

         final double temp = 38;
         final double windSpeed = 14;
         final double windChill = 35.74 + (0.6215 * temp) + (((0.4275 * temp) - 35.75) * Math.pow(windSpeed, 0.16));

         System.out.printf("\n%,.1f %s\n\n", windChill, "degrees.");

    }
}

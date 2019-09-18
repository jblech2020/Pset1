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

         double hwGrade = ((homework1 + homework2 + homework3) / 3) * hwRate;
         double quizGrade = ((quiz1 + quiz2 + quiz3) / 3) * quizRate;
         double testGrade = ((test1 + test2 + test3) / 3) * testRate;
         double grade = hwGrade + quizGrade + testGrade;
         System.out.printf("\n%,.2f%s\n", grade, "%.");
         //SHOULD BE 80.48% -> You're getting 80.15%

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

         

        /*
         * Exercise 8.
         *
         * What is the surface area of a standard Cornhole board?
         */



        /*
         * Exercise 9.
         *
         * Are the years 2020, 2100, and 2400 leap years?
         */



        /*
         * Exercise 10.
         *
         * What is the wind chill?
         */



    }
}

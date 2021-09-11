/*
 *  UCF COP3330 Fall 2021 Exercise 13 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise13;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the principal amount? ");
        int principal = sc.nextInt();

        System.out.println("What is the rate? ");
        double rate = (sc.nextDouble()/100);

        System.out.println("What is the number of years? ");
        int years = sc.nextInt();

        System.out.println("What is the number of times the interest is compounded per year? ");
        int compound = sc.nextInt();

        double total = principal*(Math.pow((1+(rate/compound)),(compound*years)));
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        System.out.println("$"+principal+" invested at "+rate*100+"% for "+years+" years compounded "+compound+" times per year is $"+df.format(total)+".");
    }
}

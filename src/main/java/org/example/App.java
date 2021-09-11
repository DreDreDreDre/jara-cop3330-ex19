package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andre Jara
 */

public class App 
{
    public static void main( String[] args )
    {
        String weightInput = "";
        String heightInput = "";
        double weight;
        double height;
        double bmi;

        Scanner sc = new Scanner(System.in);

        while(!weightInput.matches("[0123456789.]+"))
        {
            if(!weightInput.matches("[0123456789.]+") && !weightInput.equals(""))
            {
                System.out.println("You must enter a number.");
            }
            System.out.print( "Enter your weight: " );
            weightInput = sc.nextLine();
        }

        weight = Double.parseDouble(weightInput);

        while(!heightInput.matches("[0123456789.]+"))
        {
            if(!heightInput.matches("[0123456789.]+") && !heightInput.equals(""))
            {
                System.out.println("You must enter a number.");
            }
            System.out.print( "Enter your height: " );
            heightInput = sc.nextLine();
        }

        height = Double.parseDouble(heightInput);

        bmi = (weight / (height * height)) * 703;
        System.out.println("Your BMI is " + bmi + ".");

        if(bmi >= 18.5 && bmi <= 25)
        {
            System.out.println("You are within the ideal weight range.");
        }
        else
        {
            System.out.println("You are overweight. You should see your doctor.");
        }
    }
}

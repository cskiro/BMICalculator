/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

import java.util.Scanner;

/**
 *
 * @author skiroc
 */
public class BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instance Variables
        double weightInPounds, heightInInches, heightInMeters, mass, BMI;
        // Creating Scanner object for keyboard input
        Scanner kb = new Scanner(System.in);
        
        // Prompting user for weight in pounds
        System.out.println("What is your weight in pounds (lbs)?");
        weightInPounds = kb.nextDouble();
        
        // Prompting user for height in feet
        System.out.println("What is your height in inches?");
        heightInInches = kb.nextDouble();
        
        // Calculating height in meters
        heightInMeters = (heightInInches * 0.0254);
        
        // Calculating mass
        mass = (weightInPounds / 2.2);
        
        // Calculating BMI
        BMI = mass / (heightInMeters * heightInMeters);
        
        // Displaying BMI
        System.out.println("Your BMI is: " + BMI);
        
        // Calculating health risk
        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI < 25) {
            System.out.println("Normal weight");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    } // end main
    
} // end class

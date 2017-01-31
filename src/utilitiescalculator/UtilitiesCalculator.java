/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitiescalculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author zacharywiseman
 */
public class UtilitiesCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator ca = new Calculator();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many bills to you have?:");
        double[] r1 = new double[sc.nextInt()];
        System.out.println();
        for(int i=0;i<r1.length;i++){
            System.out.println("Enter the value of your bills:");
            r1[i] = sc.nextDouble(); 
        }
        System.out.println("This is your list of bills: ");
        ca.printArray(r1);
        System.out.println("This is your total: $" + ca.addValues(r1));
        System.out.println();
        
        System.out.println("How many bills does your roommate have?");
        double[] r2 = new double[sc.nextInt()];
        System.out.println();
        for(int i = 0; i < r2.length; i++){
            System.out.println("Enter the Value of thier bills:");
            r2[i] = sc.nextDouble();
        }
        System.out.println("This is your roommates list of bills: ");
        ca.printArray(r2);
        System.out.println("This is your roommates total: $" + ca.addValues(r2));
        System.out.println();
        
        double total = ca.addTotals(ca.addValues(r1), ca.addValues(r2));
        System.out.println("This is the total spent on utilities: $" + total);
        System.out.println("The average on on total spent is: $" + ca.averageTotal(total));
        System.out.println("Enter your total to find what is owed and where: ");
        double value = sc.nextDouble();
        System.out.println("Your total owed is: $" + ca.findDifference(ca.averageTotal(total), value));
        System.out.println("If your Value was negative then go get your money, if it is not, well then you should pay your roommate!!!");
    }
}

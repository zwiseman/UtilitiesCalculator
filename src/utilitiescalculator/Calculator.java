/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitiescalculator;

/**
 *
 * @author zacharywiseman
 */
public class Calculator {
    
    /**
     * Method to add value in an array
     * @param r1
     * @return 
     */
    public double addValues(double []r1){
        double result = 0;
        for(int i = 0; i<r1.length;i++){
            result += r1[i];
        }
        return result;
    }
    
    /**
     * Method to add two numbers to find the total spent 
     * @param one
     * @param two
     * @return 
     */
    public double addTotals(double one, double two){
        double total = one + two;
        return total;
    }
    
    /**
     * Method to find the average of total price
     * @param total
     * @return 
     */
    public double averageTotal(double total){
        double avg = total/2;
        return avg;
    }
    
    /**
     * Method to find the difference of two numbers
     * @param avg
     * @param total
     * @return 
     */
    public double findDifference(double avg, double total){
        double diff = avg - total;
        return diff;
    }
    
    /**
     * void method to print an array
     *
     * @param arr
     */
    public void printArray(double arr[]) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("$" + arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical2_methods;
import javax.swing.JOptionPane;
/**
 *
 * @author risun
 */
public class Practical2_Methods {
//We are creating a method to add two numbers
    //We are going to make use of two data TYPES, String for char, int for num.
   public static int calculateSum(int number1, int number2){
   return number1 + number2;
   }
   //This is our main method, this method is embedded/ comes with the project. 
    public static void main(String[] args) {
    //Ask user for first number using GUI
    String Num1 =JOptionPane.showInputDialog(null,"Enter the first number");
    String Num2 =JOptionPane.showInputDialog(null,"Enter the Second number");
    //Convert string input to integer
    int firstNum = Integer.parseInt(Num1);
    int secondNum = Integer.parseInt(Num2);
    
    int result = calculateSum(firstNum, secondNum);
    JOptionPane.showMessageDialog(null,"The answer is " + result);
    }
}
//We cannot put anything outside this class for now
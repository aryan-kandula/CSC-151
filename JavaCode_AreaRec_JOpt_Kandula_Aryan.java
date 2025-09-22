/**
    * Program Name: JavaCode_AreaRec_JOpt_Kandula_Aryan
    * Description: This program calculates the area of a rectangle.
    *              It uses JOptionPane dialogs to get the length and width 
    *              from the user, calculates the area, and then displays it.
    * Author: Kandula Aryan
    * Date: September 21, 2025
*/

import javax.swing.JOptionPane;

public class JavaCode_AreaRec_JOpt_Kandula_Aryan {

    // Static variables to store rectangle dimensions and area
    static double length;
    static double width;
    static double area;

    public static void main(String[] args) {
        getLength();      // Ask user for length
        getWidth();       // Ask user for width
        calculateArea();  // Compute the area
        displayArea();    // Show result
    }

    /**
     * Prompts the user to enter the length of the rectangle
     * and stores it in the static variable 'length'.
     */
    public static void getLength() {
        String input = JOptionPane.showInputDialog("Enter the length of the rectangle:");
        length = Double.parseDouble(input);
    }

    /**
     * Prompts the user to enter the width of the rectangle
     * and stores it in the static variable 'width'.
     */
    public static void getWidth() {
        String input = JOptionPane.showInputDialog("Enter the width of the rectangle:");
        width = Double.parseDouble(input);
    }

    /**
     * Calculates the area of the rectangle
     * using the stored length and width,
     * then saves the result in the static variable 'area'.
     */
    public static void calculateArea() {
        area = length * width;
    }

    /**
     * Displays the calculated area of the rectangle
     * in a message dialog.
     */
    public static void displayArea() {
        JOptionPane.showMessageDialog(null, "The area of the rectangle is: " + area);
    }
}

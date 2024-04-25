/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tamgiac;

/**
 *
 * @author Redmi
 */
import java.util.Scanner;

public class TamGiac{   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the lengths of the three sides of the triangle:");
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        
        String triangleType = determineTriangleType(side1, side2, side3);
        
        System.out.println("Triangle type: " + triangleType);
        
        scanner.close();
    }
    
    public static String determineTriangleType(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "NotATriangle";
        }
        
        if (side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else if ((side1 * side1 + side2 * side2 == side3 * side3) ||
                   (side1 * side1 + side3 * side3 == side2 * side2) ||
                   (side2 * side2 + side3 * side3 == side1 * side1)) {
            return "RightTriangle";
        } else {
            return "Scalene";
        }
    }
}

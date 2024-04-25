/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nextdate;

/**
 *
 * @author Redmi
 */
public class NextDate {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2012;
        
        System.out.println("Current date: " + day + "/" + month + "/" + year);
        
        String nextDate = getNextDate(day, month, year);
        
        System.out.println("Next date: " + nextDate);
    }
    
    public static String getNextDate(int day, int month, int year) {
        // Kiểm tra ràng buộc của ngày, tháng, năm
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return "Invalid date";
        }
        
        // Kiểm tra tháng có bao nhiêu ngày
        int daysInMonth;
        switch (month) {
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    daysInMonth = 29; // Năm nhuận
                } else {
                    daysInMonth = 28; // Năm không nhuận
                }
                break;
            default:
                daysInMonth = 31;
        }
        
        // Kiểm tra ngày kế tiếp
        if (day < daysInMonth) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
        
        return day + "/" + month + "/" + year;
    }
}


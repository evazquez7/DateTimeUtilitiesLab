/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Emilio
 */
public class CustomDataUtilities {
    public static void main(String[] args) {
 
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date today = Calendar.getInstance().getTime(); 
        String date1 = dateFormat.format(today);
        System.out.println("Todays Date: " + date1);
        
        
        
        DateFormat dateFormat2 = new SimpleDateFormat("M/dd/yy hh:mm:ss");
        Date today2 = Calendar.getInstance().getTime();
        String date2 = dateFormat2.format(today2);
        System.out.println("Today's Date 2: " + date2);
    }
}

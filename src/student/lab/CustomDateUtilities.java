/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 *This class will be used as a CustomDateUtilities Java 8 API methods. 
 * This will provide different methods on how to convert a dateTime to String,
 * a String dateTime to a dateTime object and the time difference between two specific dates.
 * @author Emilio
 */
public class CustomDateUtilities {
 
    
    /**
     * This method is used to convert a LocalDateTime string to a date object. 
     * @param dateTimeString
     * @return a dateTime
     */
        public LocalDateTime toDateTime(String dateTimeString) throw IllegalArgumentException {
            String dateTimeString = null;
            if (dateTimeString == null){
                throw new("LocalDateTime is mandatory");
            }
            
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, format);
            return dateTime;
        }
        
        public String toString(Calendar date, String format){
        DateFormat dateFormat = new SimpleDateFormat(format);
        Date today = Calendar.getInstance().getTime(); 
        String date1 = dateFormat.format(today);
        
            return date1;
        }
        
        public long DateDiffHours(LocalDateTime date1 , LocalDateTime date2) {                
                Duration diff = Duration.between(date1, date2);
            return diff.toHours();
        }
}

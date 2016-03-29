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
 *
 * @author Emilio
 */
public class CustomDataUtilities {
 
        public LocalDateTime toDateTime(String dateTimeString){
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

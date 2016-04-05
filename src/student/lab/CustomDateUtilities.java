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
import javax.swing.text.DateFormatter;

/**
 *This class will be used as a CustomDateUtilities Java 8 API methods. 
 * This will provide different methods on how to convert a dateTime to String,
 * a String dateTime to a dateTime object and the time difference between two specific dates.
 * @author Emilio
 */
public class CustomDateUtilities {
 
    
    /**
     * This method is used to convert a LocalDateTime string to a date object. 
     * @param dateTimeString a string representation of a LocalDateTime
     * @return a LocalDateTime object
     * @throws IllegalArgumentException if dateTimeString is null
     */
        public LocalDateTime toDateTime(String dateTimeString) throws IllegalArgumentException {
            if (dateTimeString == null){
                throw new IllegalArgumentException ("Error: dateTimeString cannot be null");
            }
            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, format);
            return dateTime;
        }
        
        /**
         * This method is used to convert a string representation of a LocalDate to a LocalDate object 
         * also accepts a the type of date format you want.
         * @param dateString a string representation of a LocalDate
         * @param format a string representation of the format being used.
         * @return a LocalDate  object
         * @throws IllegalArgumentException if either dateString or format is null
         */
        public LocalDate toDateTime(String dateString, String format) throws IllegalArgumentException {
            if (dateString == null || format == null){
                throw new IllegalArgumentException ("Error: dateTimeString cannot be null");
            }
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(format);
            LocalDate date1 = LocalDate.parse(dateString, dateFormat);
            return date1;
        }
        
        /**
         * This method is used to convert a date object to a string.
         * It also accepts the format you want the date to be converted too.
         * @param date <code>Calender</code> object
         * @param format a string representation of a date format
         * @return a date string with the format that was added on
         * @throws IllegalArgumentException if date or format is null
         */
        public String toString(Calendar date, String format) throws IllegalArgumentException{
            if (date == null || format == null ){
                throw new IllegalArgumentException ("Error: Calender Date or Format cannot be null");
            }
            DateFormat dateFormat = new SimpleDateFormat(format);
            Date today = Calendar.getInstance().getTime(); 
            String date1 = dateFormat.format(today);
        
            return date1;
        }
        
        
        /**
         * This method finds the difference in hours based on two LocalDateTime's 
         * @param date1 <code>LocalDateTime</code> object
         * @param date2<code>LocalDateTime</code> object
         * @return the difference in hours
         * @throws IllegalArgumentException if date1 or date2 are null
         */
        public long DateDiffHours(LocalDateTime date1 , LocalDateTime date2) throws IllegalArgumentException {  
            if (date1 == null || date2 == null){
                throw new IllegalArgumentException ("Error: date1 and date2 cannot be null");
            }
                Duration diff = Duration.between(date1, date2);
            return diff.toHours();
        }
}

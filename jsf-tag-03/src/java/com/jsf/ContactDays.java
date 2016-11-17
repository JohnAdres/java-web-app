package com.jsf;

/**
 * @author Hasan
 * @version java version "1.8.0_92"
 * @os windows 10
 * @date Nov 5, 2016
 */
import java.io.Serializable;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Calendar;
import javax.faces.bean.ManagedBean;
// or import javax.inject.Named;
import javax.faces.bean.SessionScoped;
// or import javax.enterprise.context.SessionScoped;
@ManagedBean(name = "formContactDays") // or @Named("formContactDays")
@SessionScoped
public class ContactDays implements Serializable {

     private int[] bestDaysToContact;

     public static class Weekday {

          private final int dayOfWeek;
          public Weekday(int dayOfWeek) {
               this.dayOfWeek = dayOfWeek;
          }

          public String getDayName() {
               DateFormatSymbols symbols = new DateFormatSymbols();
               String[] weekdays = symbols.getWeekdays();
               //String[] weekdays = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};               
               return weekdays[dayOfWeek];
          }

          public int getDayNumber() {
               return dayOfWeek;
          }
     }

     public Weekday[] getDaysOfTheWeek() {
          return daysOfTheWeek;
     }
     private static final Weekday[] daysOfTheWeek;

     static {
          daysOfTheWeek = new Weekday[7];
          for (int i = Calendar.SUNDAY; i <= Calendar.SATURDAY; i++) {
               daysOfTheWeek[i - Calendar.SUNDAY] = new Weekday(i);
          }
     }

     public void setBestDaysToContact(int[] newValue) {
          bestDaysToContact = newValue;
     }

     public String getBestDaysConcatenated() {
          return Arrays.toString(bestDaysToContact);
     }

     public int[] getBestDaysToContact() {
          return bestDaysToContact;
     }
}

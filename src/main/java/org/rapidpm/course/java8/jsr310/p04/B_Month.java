package org.rapidpm.course.java8.jsr310.p04;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by Sven Ruppert on 31.03.2014.
 */
public class B_Month {
    public static void main(String[] args) {
        Month month = Month.AUGUST;
        Locale locale = Locale.getDefault();
        System.out.println(month.getDisplayName(TextStyle.FULL, locale));
        System.out.println(month.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(month.getDisplayName(TextStyle.SHORT, locale));
        
        Month monthPlus3 = month.plus(3);
        System.out.println(monthPlus3.getDisplayName(TextStyle.FULL, locale));
        System.out.println(monthPlus3.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(monthPlus3.getDisplayName(TextStyle.SHORT, locale));
        
        Month monthMinus3 = month.minus(3);
        System.out.println(monthMinus3.getDisplayName(TextStyle.FULL, locale));
        System.out.println(monthMinus3.getDisplayName(TextStyle.NARROW, locale));
        System.out.println(monthMinus3.getDisplayName(TextStyle.SHORT, locale));
        
    }
}

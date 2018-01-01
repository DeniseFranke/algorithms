package com.denisefranke.algorithms;

import java.util.*;
import java.text.*;

/** 
* 
* Modified Currency Formatter
*
* @Author Denise Franke
*
* Usage:
*   echo '12345.123' | java ModifiedCurrencyFormatter
*
* Expected Results:
*   US: $12,324.13
*   India: Rs.12,324.13
*   China: ￥12,324.13
*   France: 12 324,13 €
*
**/ 
public class ModifiedCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String us = currencyFormatter.format(payment);     
        
        currencyFormatter = NumberFormat.getCurrencyInstance();
        DecimalFormatSymbols en = new DecimalFormatSymbols();
        en.setCurrencySymbol("Rs.");
        en.setGroupingSeparator(',');
        en.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) currencyFormatter).setDecimalFormatSymbols(en);
        String india = currencyFormatter.format(payment);
        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = currencyFormatter.format(payment);
        currencyFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = currencyFormatter.format(payment);
       
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

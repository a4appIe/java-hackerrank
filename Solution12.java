// Given a double-precision number, payment , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:

// US: formattedPayment
// India: formattedPayment
// China: formattedPayment
// France: formattedPayment

import java.util.*;
import java.text.*;

public class Solution12 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double amount = scan.nextDouble();
        scan.close();
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(amount);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(amount);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

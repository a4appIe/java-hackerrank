// The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
// Given two strings of lowercase English letters, A and B, perform the following operations:
// Sum the lengths of A and B.
// Determine if  is lexicographically larger than  (i.e.: does B come before A in the dictionary?).
// Capitalize the first letter in A and B and print them on a single line, separated by a space.

import java.util.*;

public class Solution13 {
    public static String capitalize(String str){
        StringBuilder capitalize = new StringBuilder();
        char firstChar = str.charAt(0);
        capitalize.append(Character.toTitleCase(firstChar)).append(str.substring(1));
        return capitalize.toString();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        System.out.println(A.length() + B.length());
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");
        }else{ 
            System.out.println("No");
        }
        String first = capitalize(A);
        String second = capitalize(B);
        System.out.println(first + " " + second);
        
    }
}




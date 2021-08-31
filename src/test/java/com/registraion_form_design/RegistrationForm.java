package com.registraion_form_design;
import java.util.regex.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class RegistrationForm {
    / Function to validate the First Username
    public static boolean isValidFirstUsername(String name)
    {

        // Regex to check valid username.
        String regex = "^[Cap]\\w{5,29}[A-Za-z]$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the username is empty
        // return false
        if (name == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(name);

        // Return if the username
        // matched the ReGex
        return m.matches();
    }
    public static void main(String[] args)
    {

        // Test Case: 1
        String str1 = "Geeksforgeeks";
        System.out.println(isValidFirstUsername(str1));

        // Test Case: 2
        String str2 = "Cap23aSjk";
        System.out.println(isValidFirstUsername(str2));

        // Test Case: 3
        String str3 = "Cap47RjSrc";
        System.out.println(isValidFirstUsername(str3));
    }
}

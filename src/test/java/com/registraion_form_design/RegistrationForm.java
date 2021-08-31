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
    // Function to validate the Second Username
    public static boolean isValidLastUsername(String name)
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
    //Check the Valid Email-id.
    public static boolean isValidEmail(String name)
    {
        Pattern p = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
        Matcher m = p.matcher("foobar@gmail.com");
    }
    //Checking the valid 10-digit mobile number
    @Test
    public boolean whenMatchesTenDigitsNumber_thenCorrect() {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher("91 7523654895");
        assertTrue(matcher.matches());
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
        //Checking the last username.
        // Test Case: 1
        String str1 = "Kolkata22";
        System.out.println(isValidLastUsername(str1));

        // Test Case: 2
        String str2 = "Cap36MkS";
        System.out.println(isValidLastUsername(str2));

        // Test Case: 3
        String str3 = "CapRiya526Biny";
        System.out.println(isValidLastUsername(str3));

        //Checking Email-id.
        String email = "sampritirc@gmail.com";
        System.out.println(isValidEmail(email));

        //Checking Valid Mobile Number.
        System.out.println(whenMatchesTenDigitsNumber_thenCorrect());
    }
}

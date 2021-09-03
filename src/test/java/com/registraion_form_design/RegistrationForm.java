package com.registraion_form_design;
import java.util.regex.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

public class RegistrationForm extends Exception {
    
     public RegistrationForm(String message, Throwable cause, ErrorCode code) {
            super(message, cause);
            this.code = code;
        }
        public RegistrationForm(String message, Throwable cause, ErrorCode code) {
            super(message, cause);
            this.code = code;
        }

        public RegistrationForm(String message, ErrorCode code) {
            super(message);
            this.code = code;
        }

        public RegistrationForm(Throwable cause, ErrorCode code) {
            super(cause);
            this.code = code;
        }

        public ErrorCode getCode() {
            return this.code;
        }
        public void wrapException(String input) throws RegistrationForm {
            try {
                //Checking First Username.
                String str1 = "Geeksforgeeks";
                System.out.println(isValidFirstUsername(str1));

                //Checking Last Username
                String str3 = "Riya526Biny";
                System.out.println(isValidLastUsername(str3));

                //Checking Email-id.
                String email = "sampritircgmail.com";
                System.out.println(isValidEmail(email));

                //Checking Valid Mobile Number.
                System.out.println(whenMatchesTenDigitsNumber_thenCorrect());

                //Checking Password.
                String password = "srcsrkkolkata";
                System.out.println(isValidPassword(password));
            } catch (NumberFormatException e) {
                throw new RegistrationForm("A message that describes the error.", e, ErrorCode.INVALID_PORT_CONFIGURATION);
            }
        }
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
    //Checking the valid 8-digit Password.
    @Test
    public void isValidPassword() {
        Pattern pattern = Pattern.compile("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$");
        Matcher matcher = pattern.matcher("SrcSrkKolkata");
    }
    //JUnit Happy and Sad Test Cases.
    @Test
    public void happy_sad_Test() {
        String fname = "Cap23aSjk";
        boolean fn = isValidFirstUsername(fname);
        String lname = "Kolkata22Cap";
        boolean ln = isValidSecondUsername(lname);
        String email = "sampritirc@gmail.com";
        boolean mid = isValidEmail(email);
        String ph_no = "91 9674218589";
        boolean ph = whenMatchesTenDigitsNumber_thenCorrect(ph_no);
        String password = "Sampriti07@47Kolkata";
        boolean p = isValidPassword(password);
        if (fn && ln && mid && ph && p){
            System.out.println("Happy Test Cases.");
        }
        if (fn || ln || mid || ph || p){
            System.out.println("Sad Test Cases.");
        }
    }
    //JUnit Parameterised Test
    @Test
    public void parameterised_Test(String name) {
        public void happy_sad_Test();
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

        //Check the 8-digits Password.
        String password = "SrcSrkKolkata";
        System.out.println(isValidPassword(password));

        //Checking at least 1 UpperCase in Password.
        String password_upper = "Sampriti@Kolkata";
        System.out.println(isValidPassword(password_upper));


        //Checking at least 1 Numeric Digit in Password.
        String password_numericdigit = "Sampriti0747July";
        System.out.println(isValidPassword(password_numericdigit));

        //Checking at least 1 Special Character in Password.
        String password_Spceial_char = "Sampriti07@47$July";
        System.out.println(isValidPassword(password_Spceial_char));

        //Remove all Sample Email-id
        String input = "Hello world my # is 123 mail me @ test@test.com";
        String EMAIL_PATTERN = "([^.@\\s]+)(\\.[^.@\\s]+)*@([^.@\\s]+\\.)+([^.@\\s]+)";

        String output = input.replaceAll(EMAIL_PATTERN, "") // Replace emails
                // by an empty string
                .replaceAll("\\p{Punct}", "") // Replace all punctuation. One of
                // !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
                .replaceAll("\\d", "") // Replace any digit by an empty string
                .replaceAll("\\p{Blank}{2,}+", " "); // Replace any Blank (a  space or
        // a tab) repeated more than once
        // by a single space.

        System.out.println(output);
        
         //Checking Junit Happy or Sad Test case.
        RegistrationForm obj = new RegistrationForm();
        obj.happy_sad_Test();
        
         //Checking JUnit Parameterised Test Cases.
        RegistrationForm p_obj = new RegistrationForm();
        p_obj.parameterised_Test(String name);
    }
}

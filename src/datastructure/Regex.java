package datastructure;

import java.util.regex.*;

class Regex {
 
    public static boolean isAlphaNumeric(String str)
    {
       // String regex = "^[a-zA-Z0-9][\\s]+$";
    	String regex = "^[a-zA-Z][a-zA-Z0-9\\s]*$";
    	
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }
 
    public static void main(String args[])
    {
 
        // Test Case 1:
        String str1 = "CodeforGaurav123";
        System.out.println(str1 + ": "+ isAlphaNumeric(str1));
        // Test Case 1:
        String str6 = "CodeforGaurav 123";
        System.out.println(str6 + ": "+ isAlphaNumeric(str6));
 
        // Test Case 2:
        String str2 = "CodebyGaurav";
        System.out.println(str2 + ": "+ isAlphaNumeric(str2));
        
     // Test Case 2:
        String str7 = "Codeby Gaurav";
        System.out.println(str7 + ": "+ isAlphaNumeric(str7));
 
        // Test Case 3:
        String str3 = "CodebyGaurav123@#";
        System.out.println(str3 + ": "+ isAlphaNumeric(str3));
 
        // Test Case 4:
        String str4 = "123 123";
        System.out.println(str4 + ": "+ isAlphaNumeric(str4));
 
        // Test Case 5:
        String str5 = "@#";
        System.out.println(str5 + ": "+ isAlphaNumeric(str5));
        
       
    }
}
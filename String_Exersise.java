public class String_Exersise{
    public static void main(String[] args){
        String txt = "Hello Rohit";
        System.out.println(txt.length());
        // output = 11 y space bhi count karta hai

        int index = txt.indexOf("o");
        //  output = 4 ye index 1 se count karn start karta hai
        System.out.println(index);


        // 3. Concatenate Two Strings

        //   Write a program to combine two Strings.

        //   Hint: Use + operator

        String str1 = "HELLO";
        String str2 = "  ROHIT";

        //  isme space bhi count hote hai

        String Concatenate = str1 + str2;
        System.out.println(Concatenate);
        //  output = HELLO  ROHIT
        
        // 4. Convert to Uppercase / Lowercase

// Write a program to convert a String to uppercase and lowercase.
// Hint: Use .toUpperCase() and .toLowerCase().
        String str3 = "Hello";
        String str4 = "Rohit";
        System.out.println(str3.toUpperCase());
        System.out.println(str4.toLowerCase());

// 5. Check if String Contains a Word

// Write a program to check if a String contains a certain word.
// Hint: Use .contains() method.


String str5  = "Hello Rohit What is your father name ?";
System.out.println(str5.contains("name"));
// output = true
// contain() function varify karta hai ki word hai ki nahi tab vah tru false me output deta hai

// 6. Compare Two Strings

// Write a program to compare two Strings.
// Hint: Use .equals() method.

String str6 = "hello";
String str7 = "mello";
System.out.println(str6.equals(str7));

// .equal() function compare karta hai ki dono same hai ki nahi 


// 7. Replace Characters in String

// Write a program to replace a character in a String.
// Hint: Use .replace() method.

String str8 = "HELLO ROHIT";
System.out.println(str8.replace("ROHIT", "WORLD"));


    }
}
public class Java_Strings {

    public static void main(String[] args) {
        String greeting = "Hello";
        System.out.println(greeting);

        // output = Hello

        // A String variable contains a collection of characters surrounded by double
        // quotes:

        // String Length

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // Output = The length of the txt string is: 26

        // More String Methods

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());
        System.out.println(txt2.toLowerCase());
        System.err.println();

        // output = HELLO WORLD
        // hello world

        // Finding a Character in a String

        // The indexOf() method returns the index (the position) of the first occurrence
        // of a specified text in a string (including whitespace):

        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("occurs!"));

        System.err.println();

        // Java counts positions from zero.
        // 0 is the first position in a string, 1 is the second, 2 is the third ...

        // Example
        String txt4 = "Hello";
        System.out.println(txt4.charAt(0)); // H
        System.out.println(txt4.charAt(4)); // o
        System.out.println();

        // Comparing Strings

        // To compare two strings, you can use the equals() method:

        String txt5 = "Hello";
        String txt6 = "Hello";

        String txt7 = "Greetings";
        String txt8 = "Great things";

        System.out.println(txt5.equals(txt6)); // true
        System.out.println(txt8.equals(txt7)); // false
        System.out.println();

        // Removing Whitespace

        // The trim() method removes whitespace from the beginning and the end of a
        // string:

        String txt9 = "   Hello World   ";
        System.out.println("Before: [" + txt9 + "]");
        System.out.println("After:  [" + txt9.trim() + "]");
        System.out.println();

        // output

        // Before: [ Hello World ]
        // After: [Hello World]
    }
}
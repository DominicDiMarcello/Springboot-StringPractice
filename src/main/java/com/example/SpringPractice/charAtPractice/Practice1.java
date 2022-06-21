package com.example.SpringPractice.charAtPractice;

public class Practice1 {

    public static void main(String args[]) {

        String str = "Learn string handling";
        String allUpper = "LEARN STRING HANDLING";
        String subStr = str.substring(4, 11).replaceAll("\\s+", "").trim();
        boolean isTrue = false;

        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(4);

        System.out.println("Character at 0 index is: " + ch1);
        System.out.println("Character at 1 index is: " + ch2);
        System.out.println("Character at 4 index is: " + ch3);

        if (str.equalsIgnoreCase(allUpper)) {
            isTrue = true;
        } else {
            isTrue = false;
        }

        System.out.println("Are str and allUpper equal: " + isTrue);

        System.out.println("Charactar at last index: " + str.charAt(str.length()-1));

        System.out.println("Character at 10th index: " + str.charAt(10));

        if (str.charAt(10) == str.charAt(15)) {
            System.out.println("10th index & 15th index are equal");
        } else {
            System.out.println("10th index and 15th index are not equal");
        }

        System.out.println("Substring of str: " + subStr);

        if (subStr.charAt(0) == subStr.charAt(5)) {
            System.out.println("false");
        } else {
            System.out.println("NO WORKIE");
        }

    }
}

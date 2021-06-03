
package in.java.string;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        System.out.println(rev);
        return rev;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a string: "); //HELLO
        String str = sc.nextLine(); //The nextLine() method of Scanner class is used to take a string from the user.

       ReverseString.reverseString(str );


    }
}


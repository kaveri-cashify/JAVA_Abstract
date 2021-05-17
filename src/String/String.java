package String;
import java.util.*;
public class String {


    public static class GFG {

        public static void main(String args [])
        {
            java.lang.String str = "GeeksForGeeks";

            char[] ch = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
            }

            for (char c : ch) {
                System.out.println(c);
            }
        }
    }
}

/* Program Name: StackParenLab
 * Program Purpose: Be able to validate whether parens are balanced and properly nested
 * Created / Edited by: jramrez
 */

 import java.util.*;
public class Main{
    public static void main(String[] args) {
        System.out.println("Enter a string consisting of Parentheses, Brackets, Braces, and/or Chevrons");
        Scanner scan = new Scanner(System.in);
        String usrStr = scan.nextLine();
        ParenStack stak = new ParenStack();
        for (int i = 0; i < usrStr.length(); i++) {
            
        }

        scan.close();
    }
}
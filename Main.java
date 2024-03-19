/* Program Name: StackParenLab
 * Program Purpose: Be able to validate whether parens are balanced and properly nested
 * Created / Edited by: jramrez
 */

 import java.util.*;


public class Main{
    public static void main(String[] args) {
        Lbry.clearCon();
        System.out.println("Enter a string consisting of Parentheses, Brackets, Braces, and/or Chevrons");
        Scanner scan = new Scanner(System.in);
        String usrStr = scan.nextLine();
        ParenStack stacker = new ParenStack();
        ParenChecker checker = new ParenChecker();
        
        
        for (int i = 0; i < usrStr.length(); i++) {
            if (checker.checkIfOpen(usrStr.charAt(i))) {
                stacker.push(usrStr.charAt(i));
            }
            else if (checker.checkIfClose(usrStr.charAt(i))) {
                if (stacker.size() == 0) {
                    System.out.println("INVALID");
                    break;
                }
                else if (checker.compare(usrStr.charAt(i), stacker.pop())) {
                    ;
                }
                else {
                    System.out.println("INVALID");
                    break;
                }
            }
            else {
                ;
            }
        }
        if (stacker.size() != 0) {
            System.out.println("INVALID");
        }
        else {
            System.out.println("valid");
        }

        scan.close();
    }
}
package animesh.LambdaExpressions;
//String reverse using Lambda Expressions

import java.util.Scanner;

interface StringReverse {
    String reverseFunc(String n);
}

public class SimpleLambdaExpressions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to be reversed : ");
        String inputString = "";
        inputString = sc.next();
        //Lambda Expression to reverse a string. 
        StringReverse reverse = (str) -> {
            String result = "";
            for(int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(inputString + " reverse String is : " + reverse.reverseFunc(inputString));
        sc.close();
    }
}

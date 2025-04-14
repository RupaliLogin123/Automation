package EX_15;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no,Will check the Palindrome");
        int UserInput = scanner.nextInt();


    }

    static String reverseString(String S) {
        String Reverse="";

        for (int i=S.length()-1;i>0;i--)
        {
            System.out.println(Reverse=Reverse+ S.charAt(i));
        }
        return Reverse;

    }

}
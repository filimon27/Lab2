package Lab2;

import java.util.Scanner;

public class MiddleLetter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the word");
        String word= input.next();

         if(word.length()%2==1) {
        int n= (word.length())/2;
        System.out.println(word.charAt(n));
        }
        else
        System.out.println("please enter a word with odd number of letters");
    }
}

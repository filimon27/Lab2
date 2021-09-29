package Lab2;
import java.util.Random;
import java.util.Scanner;
public class StartUp {
    public static void main(String[] args) {

         Scanner input= new Scanner(System.in);
        System.out.println("enter the statement");
         String statement= input.nextLine();

        System.out.println(statement.length() +"\n"+statement.charAt(1)  + "\n" + statement.charAt(statement.length()-1));



    }
}

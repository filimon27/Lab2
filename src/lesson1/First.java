package lesson1;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        System.out.println("Helloworld!");

        double a,b,c, result;

        System.out.println("please  enter the values a,b and c");

        Scanner keyboard= new Scanner(System.in);
        a= keyboard.nextDouble();
        b=keyboard.nextDouble();
        c=keyboard.nextDouble();

        result=Math.sqrt(Math.pow(b,2) + 4 *(a*c));
        System.out.println(result);



    }
}

package Lab3;

import java.util.Scanner;

public class DemoMath {
    
    public static void main(String[] args) {
        double a,b,c,x,y, result,result2;
        x=5.0;
        y=6.0;
        System.out.println("please  enter the values a,b and c");

        Scanner keyboard= new Scanner(System.in);
        a= keyboard.nextDouble();
        b=keyboard.nextDouble();
        c=keyboard.nextDouble();


        result=Math.sqrt(Math.pow(b,2) + 4 *(a*c));
       result2= Math.sqrt(x+4*(Math.pow(y,3)));
        System.out.println(result);
        System.out.println(result2);



    }
}

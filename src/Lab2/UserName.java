package Lab2;

import java.util.Scanner;

public class UserName {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the first name");
        String fName= input.next();
        System.out.println("enter the middle name");
        String mName=input.next();
        System.out.println("enter the last name");
        String lName= input.next();
        System.out.println(fName +" "+ mName.charAt(0)+"." + "" +lName);








    }
}

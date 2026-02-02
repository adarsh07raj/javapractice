import java.util.Scanner;

public class ifElse_condition {
    public static void main(String[]args){


    int pwd =3007;
    System.out.println("Enter your password:");
    Scanner obj = new Scanner(System.in);
    int password = obj.nextInt();

    if(password ==pwd){
        System.out.println("My name is adarsh");
        System.out.println("I am learning java");

    }
    else{
        System.out.println("Incorrect password. Access denied.");
    }


 }

}

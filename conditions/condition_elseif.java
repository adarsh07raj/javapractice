import java.util.Scanner;

public class condition_elseif {
    public static void main(String[]args){
        int marks;
        System.out.println("Eneter your marks:");
        Scanner obj = new Scanner(System.in);
        marks = obj.nextInt();

        if(marks >=90 && marks <=100){
            System.out.println("Grade A");
        }
        else if (marks >=75 && marks <90){
            System.out.println("Grade b");
        }
        else if(marks >=60 && marks <75){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }

        }
    }


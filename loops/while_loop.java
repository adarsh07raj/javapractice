import java.util.Scanner;

public class while_loop {
    public static void main(String[]args){
        int num,i=1;
        System.out.println("Enter a number to prints its table:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        while(i<=10){
            System.out.println(num+" * "+i+" ="+(num*i));
            i++;
        }
    }

    
}

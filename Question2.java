package Task1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //Question 2 Given number is positive or negative
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            int number = sc.nextInt();
            if(number >0 ){
                System.out.println("Given number is positive");
            }else{
                System.out.println("Given number is negative");
            }
        }
}

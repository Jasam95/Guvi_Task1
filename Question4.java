package Task1;
import java.util.*;
public class Question4 {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                // Input 3 numbers
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.print("Enter third number: ");
                int c = sc.nextInt();

                if(a<b & a<c){
                    System.out.println("Smallest number is: " + a);
                }else if (b<c & b<a){
                    System.out.println("Smallest number is: " + b);
                }else{
                    System.out.println("Smallest number is: " + c);
                }
                // Use Math.min to find smallest
                int smallest = Math.min(a, Math.min(b, c));
                System.out.println("Smallest number using min function: " + smallest);
            }
}

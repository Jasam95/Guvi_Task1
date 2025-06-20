package Task1;

public class Question3 {
    public static void main(String[] args) {
        //Question 3 Reverse given number
            int givenNumber = 876;
            int reverse = 0;
            while (givenNumber != 0) {
                int digit = givenNumber % 10;
                reverse = reverse * 10 + digit;
                givenNumber = givenNumber / 10;
            }
            System.out.println("Reversed number: " + reverse);
        }
}

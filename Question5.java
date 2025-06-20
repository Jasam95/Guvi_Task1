package Task1;

public class Question5 {
    public static void main(String[] args) {
        //Question 5 Number pattern
            for (int i = 1; i <= 5; i++) {
                int num=5;
                for (int j = 1; j <= i; j++) {
                    System.out.print(num);     //out i=1(5) i=2 (5,4)  i=3(5,4,3) i=4(5,4,3,2) i=5(5,4,3,2,1)
                    num--;
                }
                for (int k = 1; k <= 5 - i; k++) {
                    System.out.print(6 - i );  //repeat num
                }
                System.out.println();
            }
    }
}

package Task1;

public class Question5 {
    public static void main(String[] args) {
         //Final amount after discount applied
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the purchase amount");
        int purchaseAmount = sc.nextInt();
        double finalPrice =0;
        if(purchaseAmount < 500){
            System.out.println("no discount The product price is :" + purchaseAmount);
        } else if (purchaseAmount >= 500 & purchaseAmount <= 1000) {
            finalPrice = purchaseAmount - (purchaseAmount*((double) 10 /100));  // 10% discount
            System.out.println("10% discount ie., the product final price is :" + finalPrice);
        }else if(purchaseAmount >1000){
            finalPrice = purchaseAmount - (purchaseAmount*((double) 20 /100));  // 20% discount
            System.out.println("20% discount ie., the product final price is :" + finalPrice);
        }
    }
}

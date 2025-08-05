import java.util.Scanner;
public class DiscountCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double discount = 0;
        if (age > 60 && amount > 1000) {
            discount = amount * 0.10; 
        }
        double finalAmount = amount - discount;
        if (discount > 0) {
            System.out.println("Discount Applied: " + discount);
        } else {
            System.out.println("No Discount Applied");
        }
        System.out.println("Final Amount: " + finalAmount);
        sc.close();
    }
}

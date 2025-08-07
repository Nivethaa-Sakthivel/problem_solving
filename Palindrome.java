import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter Input: ");
        String a=sc.nextLine();
        String reversed=new StringBuilder(a).reverse().toString();
        if(a.equals(reversed)){
            System.out.println("Result: Palindrome");
        }else{
            System.out.println("Result: Not a Palindrome");
        }
    }
}

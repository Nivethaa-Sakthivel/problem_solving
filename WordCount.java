import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter Input: ");
        String a=sc.nextLine();
       String[] word=a.trim().split("\\s+");
       System.out.println("Count Of The Word: "+word.length);
    }
}

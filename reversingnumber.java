import java.util.Scanner;
public class Pattern{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int a=sc.nextInt();
    int rev=0;
    while(a!=0){
        int dig=a%10;
        rev=rev*10+dig;
        a=a/10;
    }
    System.out.println("Reversed Number: "+rev);
}
}

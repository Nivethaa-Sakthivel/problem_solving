import java.util.Scanner;
public class Maximum{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Number a: ");
       int a=sc.nextInt();
       System.out.print("Enter the Number b: ");
       int b=sc.nextInt();
       System.out.print("Enter the Number c: ");
       int c=sc.nextInt();
       if(a>b && a>c){
           System.out.println("Maximum Number A: "+a);
       }
       else if(b>c){
            System.out.println("Maximum Number B: "+b);
       }
       else{
           System.out.println("Miximum Number C: "+c);
       }
       
}
}

import java.util.Scanner;
public class Maximum{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the Number: ");
       int a=sc.nextInt();
       int c=0;
       for(int i=1;i<=a;i++){
           if(a%i==0){
               c++;
           }
       }
       if(c==2){
           System.out.println("Prime");
       }else{
           System.out.println("Not a Prime");
       }
       sc.close();
}
}

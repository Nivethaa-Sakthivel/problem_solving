import java.util.Scanner;
public class Pattern{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter 1 to N: ");
    int a=sc.nextInt();
    System.out.println("Number not divisible by 3 and 5: ");
    for(int i=1;i<=a;i++){
    if(i%3!=0 && i%5!=0){
        System.out.print(i+" ");
    }
}
}
}

import java.util.Scanner;
public class Pattern{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int a=sc.nextInt();
    for(int i=0;i<=a;i++){
        for(int j=1;j<=a-i;j++){
        System.out.print(" ");
    }
    for (int k = 1;k <= (2*i-1);k++){
    System.out.print("*");
    }
    System.out.println();
}
for(int i=a-1;i<=a;i--){
        for(int j=1;j<=a-i;j++){
        System.out.print(" ");
    }
    for (int k = 1;k <= (2*i-1);k++){
    System.out.print("*");
    }
    System.out.println();
}
}
}

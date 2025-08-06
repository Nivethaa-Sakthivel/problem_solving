import java.util.Scanner;
public class Power{
    public static int calculatepower(int base,int exponent){
        int result=1;
        for(int i=1;i<=exponent;i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Base: ");
        int base=sc.nextInt();
        System.out.print("Exponent: ");
        int exponent=sc.nextInt();
        int power=calculatepower(base,exponent);
        System.out.print("Power: "+power);
    }
}

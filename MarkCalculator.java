import java.util.Scanner;
public class Mark{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Mark:");
        int mark=sc.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("Grade A");
        }
        else if(mark>=80 && mark<=89){
            System.out.println("Grade B");
        }
        else if(mark>=70 && mark<=79){
            System.out.println("Grade C");
        }
        else if(mark<70){
            System.out.println("Grade F");
        }
    }
}

import java.util.Scanner;
public class TimeConverter{
    public static void calculateminutesandhours(int totalMinutes){
       int hours=totalMinutes/60;
       int minutes=totalMinutes%60;
       
       System.out.println("Converted Time: "+hours+" hours(s) "+minutes+" minutes(s)");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Minutes: ");
        int minutes=sc.nextInt();
        calculateminutesandhours(minutes);
    }
}

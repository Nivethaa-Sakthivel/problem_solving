import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        String user="Nivi";
        String pass= "1234";
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Username:");
        String username=sc.nextLine();
        System.out.print("Enter Password:");
        String password=sc.nextLine();
        if(username.equals(user) && password.equals(pass)){
            System.out.println("Login Successfull");
        }
        else{
            System.out.println("Invalid Credential");   
            }
            sc.close();
    }
}

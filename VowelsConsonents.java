import java.util.Scanner;
public class Java{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter Input: ");
        String a=sc.nextLine();
        int vowel=0;
        int consonents=0;
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch>='a' && ch<='z' ){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowel++;
                }else{
                    consonents++;
                }
            }
        }
        System.out.println("Vowel: "+vowel);
        System.out.print("Consonents: "+consonents);
    }
}

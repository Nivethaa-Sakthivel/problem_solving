import java.util.Scanner;
public class TimeConverter{
    public static String ReversedSentence(String sentence){
       String[] words=sentence.split(" ");
       StringBuilder result=new StringBuilder();
       for(String word:words){
           String Reversedword=new StringBuilder(word).reverse().toString();
           result.append(Reversedword).append(" ");
       }
       return result.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sentence: ");
        String sentence=sc.nextLine();
        String ReversedSentence=ReversedSentence(sentence);
        System.out.println("Reversed Sentence: "+ReversedSentence);
    }
}

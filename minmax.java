import java.util.Arrays;
public class Test{
    
    public static void main(String[] args){
      
      int[] arr={23,11,56,89,12,4,77,90,2,14};
     
     
       int max=arr[0];
       int min=arr[0];
       for(int num:arr){
           if(num>max) 
           max=num;
           if(num<min)
           min=num;
       }
       System.out.println("Maximum:"+max);
       System.out.println("Minimun:"+min);
         
       
    }
}

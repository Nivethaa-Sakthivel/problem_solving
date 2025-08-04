import java.util.Arrays;
public class Test{
    
    public static void main(String[] args){
      
      int[] arr={1,27,3,20,15};
      for(int ele:arr)
       System.out.println(ele);
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       System.out.println("Second Largest: "+arr[arr.length-2]);
       
       
    }
}

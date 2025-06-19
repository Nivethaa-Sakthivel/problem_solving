
import java.util.Arrays;
public class kthLargesElement{
    public static int findKthLargestElement(int arr[],int k){
        Arrays.sort(arr);
        return arr[arr.length-k];
        
    }
    public static void main(String[] args){
        
    
        int k =3;
        int arr[]=new int[] {6,20,8,14,12,9,4,7};
        
        System.out.println(findKthLargestElement(arr,k));
    }
}

public class SecondLargestNumber{
    static int SecondLargestNumber(int[] a){
        int max1=0,max2=0;
        if(a[0]>a[1]){
            max1=a[0];
            max2=a[1];
        }else{
            max2=a[0];
            max1=a[1];
        }
        for(int i=2;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
            }else{
                max2=a[i];
            }
        }
        return max2;
    }
    public static void main(String[] args){
        int[] a={20,42,6,25,30,88};
        System.out.println(SecondLargestNumber(a));
    }
}






public class Sorting{
    static int[] bubblesort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-i-1;i++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt() ;
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        arr=bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
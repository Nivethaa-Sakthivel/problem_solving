import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args){
        int a[]={1,45,23,16,89,90,100,65,37};
        System.out.println("Before Sorting:"+Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        System.out.println("After Sorting:"+Arrays.toString(a));
    }
}

import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args){
        int a[]={1,45,65,23,14,19,87,60,98,89,76,56};
        System.out.println("Before sorting:"+Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.print("After sorting:"+Arrays.toString(a)); 
    }
}

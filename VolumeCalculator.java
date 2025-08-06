import java.util.Scanner;
public class VolumeCalculator{
    public static double Volume(int side){
        return side*side*side;
    }
    public static double Volume(double radius,double height){
        return Math.PI*radius*radius*radius;
    }
    public static double Volume(int length,int width,int height){
        return length*width*height;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side: ");
        int side=sc.nextInt();
        System.out.print("Enter Radius and Height: ");
        double radius=sc.nextDouble();
        double height=sc.nextDouble();
        System.out.print("Enter Lenght,Width and Height: ");
        int length=sc.nextInt();
        int width=sc.nextInt();
        int cyheight=sc.nextInt();
        System.out.printf("Volume of the Cube: %.0f\n",Volume(side));
        System.out.printf("Volume of the Cylinder: %.1f\n",Volume(radius,height));
        System.out.printf("Volume of the Cuboid: %.1f\n",Volume(length,width,cyheight));
        sc.close();
    }
}

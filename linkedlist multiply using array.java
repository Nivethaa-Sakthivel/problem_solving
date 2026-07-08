import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        long num1 = 0;
        for (int i = 0; i < n1; i++) {
            num1 = num1 * 10 + arr1[i];
        }

        long num2 = 0;
        for (int i = 0; i < n2; i++) {
            num2 = num2 * 10 + arr2[i];
        }

        System.out.println(num1 * num2);
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 8;
        boolean found = false;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                index = i;
                break;
            }
        }

        if (found) {
            System.out.println("Found at position: " + index);
        } else {
            System.out.println("Not found.");
        }
    }
}

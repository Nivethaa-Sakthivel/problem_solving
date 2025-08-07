public class Toggle{
    public static void main(String[] args){
        String password="Test@123";
        boolean hasUpper=false;
        boolean hasLower=false;
        boolean hasDigit=false;
        boolean hasSpecial=false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }
        System.out.println("Input: " + password);
        if (hasUpper && hasLower && hasDigit && hasSpecial) {
            System.out.println("Result: Strong Password");
        } else {
            System.out.println("Result: Weak Password");
        }
    }
}

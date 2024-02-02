package string_practice.com;

public class lenght_notbuildinfunc {

    public static void main(String[] args) {

        String abhi = "Hello";
        char sentinel = '\0'; // You can choose any character that is not part of the actual string
        int count = 0;

        // Loop through the characters until the sentinel value is encountered
        while (abhi.charAt(count) != sentinel) {
            count++;
        }

        System.out.println("Length of the string: " + count);
    }
}

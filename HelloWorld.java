import java.util.Scanner;

//write a program to print Hello World in a case-sensitive manner, input can be of any case.
public class Question04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("HeLlO wOrLd")) {
            // Print in exact case-sensitive format
            System.out.println("UPPERCASE : "+input.toUpperCase());
            System.out.println("lowercase : "+input.toLowerCase());
        } else {
            System.out.println("Input did not match 'Hello World'");
        }
        scanner.close();
    }
}

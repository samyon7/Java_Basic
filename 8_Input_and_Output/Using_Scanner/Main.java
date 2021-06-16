import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // This part to create the function that used for input system!
        System.out.print("Insert the firt value : ");
        int first = scanner.nextInt();
        System.out.print("Insert the second value : ");
        int second = scanner.nextInt();
        int result = first + second;
        System.out.println("The sum result is : "+result);

        System.out.print("Insert the float value : "); // For float
        float fourth = scanner.nextFloat();
        System.out.println("The output : "+fourth);

        System.out.print("Insert the string value : "); // For String
        String fifth = scanner.next();
        System.out.println("The output : "+fifth); // Result is just 1 block word, not include the whitespaces

        Scanner scanner_string_space = new Scanner(System.in).useDelimiter("\n"); // This make whitespace is included by.
        System.out.print("Insert the second string value : "); // For String
        String fifth_2 = scanner_string_space.next();
        System.out.println("The output : "+fifth_2); // Result is whitespace included


        System.out.print("Insert the double value : "); // For double
        double sixth = scanner.nextDouble();
        System.out.println("The output : "+sixth);
    }
}
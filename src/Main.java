import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Exception = an event that interrupts the normal flow of a program
//                    (Dividing by zero, file not found, mismatch input type)
//                    Surrounded any dangerous code with a try{} block
//                    try{}, catch{}, finally{}

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (InputMismatchException e) {
            System.out.println("THAT WASN'T A NUMBER!");
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        } catch (Exception e) {
//            SAFETY NET
            System.out.println("SOMETHING WENT WRONG!");
        } finally {
            scanner.close();
            System.out.println("THIS ONE WILL ALWAYS BE EXECUTED!");
        }
    }

}

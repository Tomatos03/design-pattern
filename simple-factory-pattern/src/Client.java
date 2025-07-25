import factory.Operation;

import java.util.Scanner;

/**
 * @author : Tomatos
 * @date : 2025/7/25
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberA = scanner.nextInt();
        long numberB = scanner.nextInt();

        Operation operation = Operation.createOperation("*");
        Long result = operation.operation(numberA, numberB);
        System.out.println(result);
    }
}

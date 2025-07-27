import factory.AddFactory;
import product.Operation;

import java.util.Scanner;

/**
 * @author : Tomatos
 * @date : 2025/7/27
 */
public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long numberA = scanner.nextInt();
        long numberB = scanner.nextInt();

        Operation operator = new AddFactory().createOperation();
        long result = operator.getResult(numberA, numberB);

        System.out.println(result);
    }
}
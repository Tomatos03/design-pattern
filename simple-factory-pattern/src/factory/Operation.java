package factory;

import product.AddOperation;
import product.MultipleOperation;

/**
 * @author : Tomatos
 * @date : 2025/7/25
 */
public abstract class Operation {
     public static Operation createOperation(String operate) {
         return switch (operate) {
             case "*" -> new MultipleOperation();
             case "+" -> new AddOperation();
             default -> throw new IllegalStateException("illegal operation");
         };
    }

    public abstract long operation(long numberA, long numberB);
}

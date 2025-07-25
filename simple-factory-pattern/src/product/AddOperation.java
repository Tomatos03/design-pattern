package product;

import factory.Operation;

/**
 * @author : Tomatos
 * @date : 2025/7/25
 */
public class AddOperation extends Operation {
    @Override
    public long operation(long numberA, long numberB) {
        return numberA + numberB;
    }
}

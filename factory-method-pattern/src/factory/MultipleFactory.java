package factory;

import product.MultipleOperation;
import product.Operation;

/**
 * @author : Tomatos
 * @date : 2025/7/27
 */
public class MultipleFactory extends AbstractFactory {
    @Override
    public Operation createOperation() {
        return new MultipleOperation();
    }
}

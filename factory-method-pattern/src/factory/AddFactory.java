package factory;

import product.AddOperation;
import product.Operation;

/**
 * @author : Tomatos
 * @date : 2025/7/27
 */
public class AddFactory extends AbstractFactory{
    @Override
    public Operation createOperation() {
        return new AddOperation();
    }
}

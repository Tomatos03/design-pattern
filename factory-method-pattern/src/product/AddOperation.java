package product;

/**
 * @author : Tomatos
 * @date : 2025/7/25
 */
public class AddOperation extends Operation{
    @Override
    public long getResult(long numberA, long numberB) {
        return numberA + numberB;
    }
}

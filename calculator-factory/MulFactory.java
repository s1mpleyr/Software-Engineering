public class MulFactory implements OperationFactory {
    public Operation createOperation() {
        return new MulOperation();
    }
}

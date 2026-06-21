public class SubFactory implements OperationFactory {
    public Operation createOperation() {
        return new SubOperation();
    }
}

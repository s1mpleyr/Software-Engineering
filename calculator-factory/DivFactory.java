public class DivFactory implements OperationFactory {
    public Operation createOperation() {
        return new DivOperation();
    }
}

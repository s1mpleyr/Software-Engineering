public class AddFactory implements OperationFactory {
    public Operation createOperation() {
        return new AddOperation();
    }
}

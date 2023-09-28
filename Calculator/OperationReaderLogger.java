package Calculator;

public class OperationReaderLogger implements OperationReader{

    @Override
    public void PerfomedOperation(String operation) {
        System.out.println("Operation" + operation);
    }
    
}

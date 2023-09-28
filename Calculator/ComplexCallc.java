package Calculator;

import java.util.ArrayList;
import java.util.List;

public class ComplexCallc {
    private List<OperationReader> readers = new ArrayList<>();
    private NumberFactoryComplex factoryComplex;
    private Operation operation;

    public ComplexCallc(NumberFactoryComplex factoryComplex, Operation operation) {
        this.factoryComplex = factoryComplex;
        this.operation = operation;
    }

    public Number add(Number num1, Number num2) {
        Number finalResult = operation.result(num1, num2);
        notifyReader("сложение: " + num1.toString() + " + " + num2.toString() + " = " + finalResult.toString());
        return finalResult;
    }

    public Number multiply(Number num1, Number num2) {
        Number finalResult = operation.result(num1, num2);
        notifyReader("умножение: " + num1.toString() + " * " + num2.toString() + " = " + finalResult.toString());
        return finalResult;
    }

    public Number divide(Number num1, Number num2) {
        Number finalResult = operation.result(num1, num2);
        notifyReader("деление: " + num1.toString() + " /" + num2.toString() + " = " + finalResult.toString());
        return finalResult;
    }

    public void addReader(OperationReader reader){
        readers.add(reader);
    }
    public void removeReader(OperationReader reader) {
        readers.remove(reader);
    }

    public void notifyReader(String operation) {
        for (OperationReader reader : readers){
            reader.PerfomedOperation(operation);
        }
    }
}


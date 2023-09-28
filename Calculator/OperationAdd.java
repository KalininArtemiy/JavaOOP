package Calculator;

public class OperationAdd implements  Operation{

    @Override
    public NumberComplex result(Number num1, Number num2) {
        double real = num1.getRealNumber() + num2.getRealNumber();
        double imagine = num1.GetImagineNumber() + num2.GetImagineNumber();
        return new NumberComplex(real, imagine);
    }
    
}

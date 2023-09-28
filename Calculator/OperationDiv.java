package Calculator;

public class OperationDiv implements Operation{
    @Override
    public Number result(Number num1, Number num2) {
        double magnitude = Math.sqrt(num1.getRealNumber() * num1.getRealNumber() + num1.GetImagineNumber() * num1.GetImagineNumber()) / 
            Math.sqrt(num2.getRealNumber() * num2.getRealNumber() + num2.GetImagineNumber() * num2.GetImagineNumber());
        double phase = Math.atan2(num1.GetImagineNumber(), num1.getRealNumber()) -
        Math.atan2(num2.GetImagineNumber(), num2.getRealNumber());
        return new NumberPolar(magnitude, phase);
    }
    
}

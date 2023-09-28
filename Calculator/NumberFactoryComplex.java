package Calculator;

public class NumberFactoryComplex implements NumberFactory{

    @Override
    public Number ComplexNumber(double RealPart, double ImaginePart) {
        return new NumberComplex(RealPart, ImaginePart);
    }
    
}

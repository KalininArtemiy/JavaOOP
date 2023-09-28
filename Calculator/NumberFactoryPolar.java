package Calculator;

public class NumberFactoryPolar implements NumberFactory{
    @Override
    public Number ComplexNumber(double RealPart, double ImaginePart) {
        double magnitude = Math.sqrt(RealPart * RealPart + ImaginePart * ImaginePart);
        double phase = Math.atan2(ImaginePart, RealPart);
        return new NumberPolar(magnitude, phase);
    }
}


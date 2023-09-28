package Calculator;

public class NumberPolar implements Number{
    private double magnitude;
    private double phase;

    public NumberPolar(double magnitude, double phase){
        this.magnitude = magnitude;
        this.phase = phase;
    }
    @Override
    public double getRealNumber() {
        return magnitude * Math.cos(phase);
    }

    @Override
    public double GetImagineNumber() {
        return magnitude * Math.sin(phase);
    }
    
}

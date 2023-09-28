package Calculator;

/**
 * @Класс комплпексного числа с конструктором
 */
public class NumberComplex implements Number{
    private double RealPart;
    private double ImaginePart;

    public NumberComplex(double RealPart, double ImaginePart){
        this.RealPart = RealPart;
        this.ImaginePart = ImaginePart;
    }

    /**
    * @param Getter for real part of complex 
    */
    @Override
    public double getRealNumber() {
        return RealPart;
    }

    /**
    * @param Getter for imagine part of complex 
    */

    @Override
    public double GetImagineNumber() {
        return ImaginePart;
    }

    
    
} 

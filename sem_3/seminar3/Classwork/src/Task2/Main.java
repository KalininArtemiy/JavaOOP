package Task2;

public class Main {
    public static void main(String[] args) throws Exception {
    MyParamValue myParamValue = (n) -> 10.0 / n;
    System.out.println(myParamValue.getValue(5));
    System.out.println("------------------------");
    MyDoubleParamValue myDoubleParamValue = (val1, val2, val3) -> 10.0 * val1 * val2 * val3;
    MyDoubleParamValue myDoubleParamValue2 = (x, y, z) -> x + y + z;
    System.out.println(myDoubleParamValue.getValue(2, 2,2));
    System.out.println("--------------------");
    System.out.println(myDoubleParamValue2.getValue(2, 2, 2));
    }
}

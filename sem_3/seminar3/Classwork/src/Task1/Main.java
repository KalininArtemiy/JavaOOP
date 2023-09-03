package Task1;
public class Main {
    public static void main(String[] args) throws Exception {
        MyParamValue myParamValue;
        myParamValue = () -> 98.6; 
        System.out.println(myParamValue.getValue());
    }
}

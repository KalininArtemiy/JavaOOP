package Task3;

public class Main {
    public static void main(String[] args) throws Exception {
        MyParamValue myParamValue = (n) -> {
            for (int i = 0; i < n; i++){
                System.out.println(i);
            }
            return n + 10;
        };
        System.out.println(myParamValue.getValue(100));
    }
}

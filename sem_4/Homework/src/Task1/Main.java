package Task1;
public class Main {
    public static void main(String[] args) throws Exception {
        printElement("Hellow World!");
        printElement(100);
        printElement(10.101);
    }
    public static <T> void printElement(T element) {
        System.out.println(element);
        
    }
}

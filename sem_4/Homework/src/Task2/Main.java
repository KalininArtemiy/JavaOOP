package Task2;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.5, 6.7};
        String[] stringArray = {"Hellow", "world", "!"};
        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
    }
    public static <T> void printArray(T[] array) {
        for (T element : array){
            System.out.print(element + " ");
        }
        
    }
}

package Task3;

public class Main {
    public static void main(String[] args) {
        getMax(10, 129);
        getMax("computer", "car");
        getMax(12.2, 23.1);
    }

    public static <T extends Comparable<T>> void getMax (T value1, T value2){
        System.out.println((value1.compareTo(value2)) < 0 ? value2 : value1);
                //при сравнении 1 и 2 значения результат меньще нуля? ДА - 2 значение, нет - 1 значение 
    }
}

package seminar3Task3;
public class Main32 {
    public static void main(String[] args) {
        Dog23 dog = new Dog23();
        Cat23 cat = new Cat23();

        // Использование методов из интерфейсов
        dog.makeSound(); // Вывод: The dog barks.
        dog.play();      // Вывод: The dog plays fetch.

        cat.makeSound(); // Вывод: The cat meows.
    }
}

package seminar2;

public class Main {
    public static void main(String[] args) {
        Doggy dog = new Doggy("Buddy");
        Kitty cat = new Kitty("Timoshka");
        
        // Вызов методов makeSound()
        dog.makeSound(); // Выводит "Buddy barks."
        cat.makeSound(); // Выводит "Whiskers meows."
    }
}
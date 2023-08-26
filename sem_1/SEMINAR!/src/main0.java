public class main0 {
    public static void main(String[] args) {
        
        Mamal lion = new Mamal("Lion", 5, "Yellow");
        Bird sparrow = new Bird("Sparrow", 2, true);

        // Использование методов и вывод информации
        lion.makeSound();
        lion.displayInfo();

        sparrow.makeSound();
        sparrow.displayInfo();

        // Animal animal = new Animal("Petr", 12);
        // animal.displayInfo();
        // Animal my_cat = new Animal("Timon");
        // my_cat.displayInfo();
        // Animal animal3 = new Animal();
        // animal3.displayInfo();
        // animal3.name = "Fatiev";
        // animal3.age = 30;
        // animal3.displayInfo();
    }
}

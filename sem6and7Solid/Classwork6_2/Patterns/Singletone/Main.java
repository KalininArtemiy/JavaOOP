package sem6and7Solid.Classwork6_2.Patterns.Singletone;


class Zoo {
  // Приватное статическое поле для хранения единственного экземпляра
  private static Zoo instance;

  // Zoo instance = new Zoo();
  // Приватный конструктор, чтобы предотвратить создание экземпляров извне класса
  private Zoo() {
    // Здесь можно инициализировать ресурсы зоопарка
  }

  // Метод для получения единственного экземпляра класса
  public static Zoo getInstance() {
    if (instance == null) {
      instance = new Zoo();
    }
    return instance;
  }

  // Добавим метод для добавления животных в зоопарк
  public void addAnimal(String animal) {
    System.out.println("Добавлено животное: " + animal);
  }

  // Другие методы и данные о зоопарке
}

public class Main {
  public static void main(String[] args) {
    // Получаем единственный экземпляр зоопарка
    Zoo zoo = Zoo.getInstance();

    // Добавляем животных в зоопарк
    zoo.addAnimal("Лев");
    zoo.addAnimal("Зебра");
    zoo.addAnimal("Слон");

    // Получаем еще раз тот же экземпляр зоопарка
    Zoo sameZoo = Zoo.getInstance();

    // Проверяем, что это действительно один и тот же объект
    if (zoo == sameZoo) {
      System.out.println("Это один и тот же зоопарк!");
    }
  }
}

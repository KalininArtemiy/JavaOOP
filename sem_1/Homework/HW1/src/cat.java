// crearing class cat
class Cat {
    private String name; //private name
    private int age; //private age
    private owner ownerName; //нужно ли было вообще добовлять владельца в основной класс? Можно ли добавить владельца как-то иначе?


    //оба конструктара доступны в App, однако я не понял как создать кота по 2 конструктуру сразу с владельцем
    //Class cat constructor
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Class cat constructor
    public Cat(String name, int age, owner ownerName){
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;//можно базове имя задать null? 
    }
    // Getter for getting cat's name
    public String getName() {
        return name;
    }
    //Seter for giving name to the cat
    public void setName(String name) {
        this.name = name;
    }
    // Getter for getting cat's age
    public int getAge() {
        return age;
    }

    // seter for setting cat's age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    //greeting method
    public void greeting(String name, int age){
        System.out.println("Mew " + "My name is " + name + ". I am " + age + " years old");

    }
    //Setter for setting owner
    public void setOwnerName(owner ownerName) {
        this.ownerName = ownerName;
    }
    public owner getOwnerName() {
        return ownerName;
    }
}

//так и не понял как из класса Cat взять владельтца, не понял где это делать и нужен ли для этого отдельный конструктор, если нужен, то как задать имя владельца
//при создании нового объекта класса Cat, я могу отдельно создать владельца до создания кота и в нового кота передать владельца, но как через конструктор это реализовать - я не понял
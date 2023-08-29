package seminar3Task3;
class Dog23 implements Pet23 {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }

    @Override
    public void play() {
        System.out.println("The dog plays fetch.");
    }
}
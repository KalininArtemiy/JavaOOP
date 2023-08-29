package seminar2;
class Doggy implements SoundMaker {
    private String name;

    public Doggy(String name) {
        this.name = name;
    }


    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}
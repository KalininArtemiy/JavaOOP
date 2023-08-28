class Kitty implements SoundMaker {
    private String name;

    public Kitty(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}
package Task4;

public class Main {
    public static void main(String[] args) {
        DataConntainer<String> dataConntainer = new DataConntainer<>();
        dataConntainer.addToContainer("Cat");
        dataConntainer.addToContainer("Doggy");
        dataConntainer.addToContainer("chinchilla");
        dataConntainer.addToContainer("Elephant");
        dataConntainer.printData();
        System.out.println("----------------------------");
        dataConntainer.sort((element1, element2) -> element2.compareTo(element1));
        dataConntainer.printData();
        System.out.println("----------------------------");
        System.out.println(dataConntainer.getFromContainer(1));

    }
}

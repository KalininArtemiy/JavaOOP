public class App {
    public static void main(String[] args) throws Exception {
        Cat newCatOne = new Cat("Timon", 1); // создаем кота с именем и возрастом
        newCatOne.greeting(newCatOne.getName(), newCatOne.getAge()); //приветсвие кота
        newCatOne.setAge(2);//изменяем коту возраст
        newCatOne.setName("Tim Temich");//изменяем коту имя
        newCatOne.greeting(newCatOne.getName(), newCatOne.getAge());//проверяем,работает
        
        owner newOwner = new owner("Vasa");//создаеи коту владельца
        Cat newCatTwo = new Cat("Barsik", 2);//создаем кота
        newCatTwo.setOwnerName(newOwner);//передаем владельца коту
        //можно ли через конструктор создать кота сразу с владельцем?
        //можно ли переопределить метод greeting и добавить туда владельца, а не переписовать весь метод в классе Cat?
        //Cat newCatThree = new Cat("Pushok", 7, setOwnerName(owner ownerName)) - через вставку не рабоатет, только если заранне создать владельца
        
        
        //можно ли вызвать уже существующий greeting с добавлением владельца? 



    }
}
//не работает Overide, хотел переопределить приветсвие, однако выдает ошибку
// @Override
// public void greeting(String name, int age){
//         super.greeting();
//         System.out.println("My owner: " + newOwner);
// }

package homework;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Market implements QueueBehaviour, MarketBehaviour{
    private Queue <String> queue;
    private Queue <String> orders;

    public Market () {
        this.queue = new LinkedList();
        this.orders = new LinkedList();
    }

    @Override
    public void purOrder(String Order) {
        orders.add(Order);
    }

    @Override
    public String takeOrder() {
        return orders.poll();
    }

    @Override
    public void addPerson(String person) {
        queue.add(person);
    }

    @Override
    public String removePerson() {
        return queue.poll();
    }

    @Override
    public Integer size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    //просто бесконечный ввод людей м заказов до ключегого слова stop. Например, как в фастфуде - на терминале это программа постоянно работает, человек
    //делает заказ ему сообщают его место в очереди(всегда было интересно реализовать, а тут такая возможность)
    public Market creatingQeue(Market market){
        Scanner newScanner = new Scanner(System.in);
        Scanner newScan = new Scanner(System.in);
        Integer count = 1;
        boolean status = true;
        while (status){
            System.out.println("Введите любой ключ чтобы продолжить, введите    stop   чтобы закончить программу");
            String nextCommand = newScanner.nextLine();
            if (nextCommand.equals("stop")){
                System.out.println("Текущий размер очереди - " + market.size());
                break;
            }else{
                String position = Integer.toString(count);
                market.addPerson(position);
                System.out.println("Ваша позиция в очереди: " + position + " сделайте заказ: ");
                String newOrder = newScanner.nextLine();
                market.purOrder(newOrder);
                count += 1;
            }
        } 
        newScanner.close();
        newScan.close();
        return market;
    }

    public void update(Market market){
        // Scanner newScanner = new Scanner(System.in);
        // // while(!(isEmpty())){
        //     System.out.println("Нажмиите любую кнопку если заказ готов. Введите stop для остановки программы: ");
        //     String nextCommand = newScanner.nextLine();
        //     if (nextCommand.equals("stop")){
        //         System.out.println("В очереди осталось - " + market.size());
        //     }else{
                String qeueReady = market.removePerson();
                String orderDone = market.takeOrder();
                System.out.println("Заказ " + qeueReady + " готов. Вы заказывали " + orderDone);
    //         }
    //     // }
    //     newScanner.close();
    //     System.out.println("Очередь пуста");
    }
}

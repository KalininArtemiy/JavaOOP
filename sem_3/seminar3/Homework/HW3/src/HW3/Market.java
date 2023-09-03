package HW3;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Market implements QueueBehaviour, MarketBehaviour{
    private Queue <String> queue;
    private Queue <Order> orders;

    public Market () {
        this.queue = new LinkedList();
        this.orders = new LinkedList();
    }

    @Override
    public void purOrder(Order order) {
        orders.add(order);
    }

    @Override
    public Order takeOrder() {
        return orders.remove();
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
                System.out.println("______________________");
                break;
            }else{
                String position = Integer.toString(count);
                market.addPerson(position);
                System.out.println("сделайте заказ: ");
                Order newOrder = new Order();
                newOrder.addProduct();
                System.out.println("Ваш номер заказа: " + position);
                market.purOrder(newOrder);
                count += 1;
            }
        } 
        newScanner.close();
        newScan.close();
        return market;
    }

    public void update(Market market){
        // System.out.println("Enter any key to continue");
        // Scanner AnyKey = new Scanner(System.in);
        // try
        // {
        //     System.in.read();
        //     AnyKey.nextLine();
        // }  
        // catch(Exception e)
        // {}  
        String qeueReady = market.removePerson();
        Order orderDone = market.takeOrder();
        
        System.out.println("Заказ " + qeueReady + " готов.");
        orderDone.showProducts();
        System.out.println("-------------------------------");
        // AnyKey.close();
    }
}

package HW3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Order {
    private ArrayList<String> order;

    public Order() {
        this.order = new ArrayList<String>();
    }

    public void showProducts(){
        Iterator<String> productsInOrder = order.iterator();
        System.out.println("Вы заказали " );
            while (productsInOrder.hasNext()) {
                System.out.println(productsInOrder.next());
                System.out.println("");
            }
    }


    public void addProduct(){
        Scanner nScanner = new Scanner(System.in);
        boolean status = true;
        while (status){
            System.out.println("Вводите заказы для добавления в корзину, введите pay для оплаты и завершения");
            String nextAction = nScanner.nextLine();
            if (nextAction.equals("pay")){
                showProducts();
                break;
            }else{ 
                String newProduct = nextAction;
                order.add(newProduct);
            }
        }
    }
}

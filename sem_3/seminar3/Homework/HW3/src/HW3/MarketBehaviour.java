package HW3;
//интерфейс очереди - добовляет у удаляет заказы
public interface MarketBehaviour {
    void purOrder(Order order);//добавляет
    Order takeOrder();//удалляет
}

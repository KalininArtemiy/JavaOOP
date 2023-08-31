package homework;
//интерфейс очереди - добовляет у удаляет заказы
public interface MarketBehaviour {
    void purOrder(String Order);//добавляет
    String takeOrder();//удалляет
}

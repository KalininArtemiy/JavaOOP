package HW3;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Market market = new Market();//наш магазин
        //этот метод выводится на отдельный терминал или аппарат, он в постоянном режиме принимает заказы и формирует очередь и заказы
        market.creatingQeue(market);

        
        market.update(market);
        //просто доделал предыдущее домашнее задание
        //создал класс Ordr, конструктор к нему сеттер продуктов в него и метод показа продуктов (для него использовал иттератор)
        
    }
}

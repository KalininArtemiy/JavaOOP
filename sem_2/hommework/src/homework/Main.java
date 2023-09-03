package homework;
public class Main {
    public static void main(String[] args) throws Exception {
        Market market = new Market();//наш магазин
        //этот метод выводится на отдельный терминал или аппарат, он в постоянном режиме принимает заказы и формирует очередь и заказы
        market.creatingQeue(market);
        
        for(int i = 0; i <= market.size(); i++){
            market.update(market);
        }
    }
}



package HW2.src.homework2;

public class App {
    public static void main(String[] args) throws Exception {
        Rectangle newRectangle1 = new Rectangle(10); //cоздаем 3 разных прямоугольника для проверки 
        Rectangle newRectangle2 = new Rectangle(7, 2);
        Rectangle newRectangle3 = new Rectangle();
        newRectangle1.showSides();//выводим их стороны все работает
        newRectangle2.showSides();
        newRectangle3.showSides();
        //вычисляем площадь всех 3 квадратов и все работает
        System.out.println("------------------------------");
        System.out.println(newRectangle1.calculateArea(newRectangle1.getWidth(), newRectangle1.getHeight()));
        System.out.println(newRectangle2.calculateArea(newRectangle2.getWidth(), newRectangle2.getHeight()));
        System.out.println(newRectangle3.calculateArea(newRectangle3.getWidth(), newRectangle3.getHeight()));
        //вычисляем периметр всех 3 квадратов и все работает
        System.out.println("------------------------------");
        System.out.println(newRectangle1.calculatePerimeter(newRectangle1.getWidth(), newRectangle1.getHeight()));
        System.out.println(newRectangle2.calculatePerimeter(newRectangle2.getWidth(), newRectangle2.getHeight()));
        System.out.println(newRectangle3.calculatePerimeter(newRectangle3.getWidth(), newRectangle3.getHeight()));  
        System.out.println("------------------------------");
        //сеттером изменим 1 стороны и повторим
        newRectangle1.setWidth(100);
        newRectangle1.setNeight(137);
        System.out.println(newRectangle1.calculateArea(newRectangle1.getWidth(), newRectangle1.getHeight()));
        System.out.println(newRectangle1.calculatePerimeter(newRectangle1.getWidth(), newRectangle1.getHeight()));
    }


}

public class Rectangle {
    private Integer width;
    private Integer height;

    /**s
     * три конструтора для создания прямоугольников (строки 8-19)
     */
    public Rectangle() {
        this.width = 10;
        this.height = 20;
    }

    public Rectangle(Integer x, Integer y) {
        this.width = x;
        this.height = y;
    }
    public Rectangle(Integer X) {
        this(X,X);
    }

    //показ сторон треугольника (метод)
    public void showSides(){
        System.out.println("width is " + width + " height is " + height);
    }
    //геттеры и сеттеры для сторон и высоты (26-44)
    public Integer getHeight() {
        return height;
    }

    public void setNeight(Integer height) {
        if (height > 0){
             this.height = height;
        }
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    // вычисляем площадь
    public Integer calculateArea(Integer width, Integer height){
        Integer area = width * height;
        return area;
    }

    public Integer calculatePerimeter(Integer width, Integer height){
        Integer perimetr = 2 * (width + height);
        return perimetr;
    }
}

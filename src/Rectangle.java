public class Rectangle extends Shape {
    private int length = 1;
    private int width = 1;



    public  Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 *(length + width);
    }
}

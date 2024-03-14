public class Square extends Shape{
    private int length = 1;



    public Square(int length){
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return length * 4;
    }

    @Override
    public double calculateArea() {
        return Math.pow(length,2);
    }
}

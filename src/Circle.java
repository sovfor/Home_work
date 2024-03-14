public class Circle extends Shape {
    private int radius = 1;

    public  Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public double calculateArea(){
        return  Math.PI * Math.pow(radius,2);
    }


}

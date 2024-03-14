import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {




    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Shape rectangle = new Rectangle(5,4);
        Shape o = new Circle(5);
        Shape square = new Square(4);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println(o.calculateArea());
        System.out.println(o.calculatePerimeter());

        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());



    }
}
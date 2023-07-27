import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;
//Write a Java program to create a class called "Rectangle" with width and height attributes.
//Calculate the area and perimeter of the rectangle.
//CREATED A CLASS CALLED Rectangle
public class Rectangle {
    private int width;   // Used the private identifier coz we are using the getters and setters methods
    private int height;

    public Rectangle (int width, int height){   // created a constructor to initialise attributes of the rectangle
        this.height = height;
        this.width  = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {  // Used to get attributes from the constructor
        return width;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public void setWidth(int width) {  //Used when attributes are to be updated

        this.width = width;
    }
    public int getArea (){

        return width*height;
    }
    public int getPerimeter(){

        return 2*(width*height);
    }
    public static void main(String[] args){

        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,1);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());

    }
}

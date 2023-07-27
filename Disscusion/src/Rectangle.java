import java.awt.geom.Area;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double Area(){
       return width*height;
    }
    public static void main(String[] args){
        Rectangle obj1 = new Rectangle(2.2,3);
        System.out.println(obj1.getHeight()+ " and " +obj1.getWidth());
        System.out.println(obj1.Area());

    }
}

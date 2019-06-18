import java.util.Scanner;

public class Rectangle {
    double width,height;
    public Rectangle()
    {

    }
    public Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public double getArea()
    {
            return this.height*this.width;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhap chieu dai = ");
        double width =scanner.nextDouble();
        System.out.println("Nhap chieu cao = ");
        double heigh=scanner.nextDouble();
        Rectangle rectangle=new Rectangle(width,heigh);
        System.out.println(rectangle.display());
        System.out.println("Chu vi cua hinh chu nhat = "+rectangle.getPerimeter()+" Dien tich hinh chu nhat = "+rectangle.getArea());

    }
}

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        double width=scanner.nextInt();
        System.out.println("Nhap chieu rong");
        double height=scanner.nextInt();
        Rectangle rectangle=new Rectangle(width,height);
        System.out.println(rectangle.display());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }

}
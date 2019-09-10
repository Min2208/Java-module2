import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a=scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b=scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c=scanner.nextDouble();

        QuadraticEquation account=new QuadraticEquation(a,b,c);

        System.out.println(account.getDiscriminant());
        System.out.println(account.getRoot1());
        System.out.println(account.getRoot2());
    }
}
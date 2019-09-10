public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = this.b * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double result = 0;
        if (getDiscriminant() >= 0) {
            result = (-this.b + Math.pow(getDiscriminant(),0.5)) / 2*this.a;
        }
        return result;
    }

    public double getRoot2() {
        double result = 0;
        if (getDiscriminant() >= 0) {
            result = (-this.b - Math.pow(getDiscriminant(),0.5)) / 2*this.a;
        }
        return result;
    }

}

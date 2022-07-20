import java.util.Scanner;
public class AreaCalculator {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double radius = input.nextDouble();
    }

    public static double areaRectangle(double length, double width) {
        return length * width;
    }

    public static double areaCircle (double radius) {
        return Math.PI * radius * radius;
    }
}
